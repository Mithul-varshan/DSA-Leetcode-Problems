class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int j=0;
        k=k%n;    // when nums=[1,2,3,4,5] and k = 7 n-k=-2 which results in outofbound in loop so we use this 
        // at 1st rotation it will be [5,1,2,3,4] at 5th rotation also [5,1,2,3,4] 5%5 == 1 so k=k%n we are doing
        int[] dup = new int[n];
        for(int i=n-k;i<n;i++){
            dup[j++] = nums[i];
        }
        for(int i=0;i<n-k;i++){
            dup[j++] = nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i] = dup[i];
        }
    }
}