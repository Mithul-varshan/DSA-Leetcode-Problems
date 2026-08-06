class Solution {
    public int sumSubarrayMins(int[] arr) {
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     int min = Integer.MAX_VALUE;
        //     for(int j=i;j<arr.length;j++){
        //         min = Math.min(min,arr[j]);
        //         sum=(sum+min) % (1000000000 + 7);
        //     }
        // }
        // return sum;
        int n=arr.length;
        int[] prev = new int[n];
        int[] next = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                prev[i] = -1;
            }
            else{
                prev[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                next[i] = n;
            }
            else{
                next[i] = st.peek();
            }
            st.push(i);
        }
        long sum=0;
        int mod = 1000000000 + 7;
        for(int i=0;i<n;i++){
            long left = i - prev[i];
            long right = next[i] - i;
            sum = (sum + (arr[i] * left * right) % mod) % mod;
            // System.out.println(sum);
        }
        return (int)sum;
        
    }
}