class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] extended = new int[2 * n];
        for(int i = 0; i < n; i++) {
            extended[i] = nums[i];
            extended[i + n] = nums[i];
        }
        int[] res = new int[n];
        for(int i = extended.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() <= extended[i]) {
                stack.pop();
            }
            if (i < n) {
                if(stack.isEmpty())
                    res[i] = -1;
                else
                    res[i] = stack.peek();
            }
            stack.push(extended[i]);
        }
        return res;
    }
}