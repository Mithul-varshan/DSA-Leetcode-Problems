class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] num2 = new int[n*2];
        for(int i=0;i<n;i++) {
            num2[i] = nums[i];
        }
        for(int i=0; i<n;i++) {
            num2[i+n] = nums[i];
        }
        int[] res = new int[n];
        for(int i=num2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= num2[i]){
                st.pop();
            }
            if (i < n) {
                if(st.isEmpty()){
                    res[i] = -1;
                }
                else{
                    res[i] = st.peek();
                }
            }
            st.push(num2[i]);
        }
        return res;
    }
}