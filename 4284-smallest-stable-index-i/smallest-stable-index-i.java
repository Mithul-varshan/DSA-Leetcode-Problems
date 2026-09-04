class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int min = Integer.MAX_VALUE;
        //     max = Math.max(max, nums[i]);
        //     for(int j=i;j<nums.length;j++){
        //         min = Math.min(min, nums[j]);
        //     }
        //     if(max - min <= k) return i;
        // }
        // return -1; 

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        int n = nums.length;

        int[] prefixMax = new int[n];
        prefixMax[0] = nums[0];

        for(int i=1;i<n;i++){
            prefixMax[i] = Math.max(prefixMax[i-1],nums[i]);
        }
        
        int[] suffixMin = new int[n];
        suffixMin[n-1] = nums[n-1];

        for(int i=n-2;i>=0;i--){
            suffixMin[i] = Math.min(suffixMin[i+1],nums[i]);
        }
        for(int i=0;i<n;i++){
            if(prefixMax[i] - suffixMin[i] <= k) return i;
        }
        return -1;
    }
}
