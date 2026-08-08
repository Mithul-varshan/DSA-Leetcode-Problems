class Solution {
    public long subArrayRanges(int[] nums) {
        // long sum=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         if(i==j){
        //             sum+=0;
        //         }
        //         else{
        //             long min = Integer.MAX_VALUE;
        //             long max = Integer.MIN_VALUE;
        //             for(int k=i;k<=j;k++){
        //                 if(nums[k] < min) min = nums[k];
        //                 if(nums[k] > max) max = nums[k];
        //             }
        //             sum+= max-min;
        //         }
        //     }
        // }
        // return sum;

        int n = nums.length;
        int[] prev = new int[n];
        int[] next = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()] > nums[i]){
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
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
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
        long smallSum=0;
        for(int i=0;i<n;i++){
            int left = i - prev[i];
            int right = next[i] - i;
            smallSum = (smallSum + (long)nums[i] * left * right); 
        }
        
        st.clear();
        // large sum
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i]){
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
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]){
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
        long largeSum=0;
        for(int i=0;i<n;i++){
            int left = i - prev[i];
            int right = next[i] - i;
            largeSum = (largeSum + (long)nums[i] * left * right); 
        }

        return largeSum - smallSum ;
    }
}