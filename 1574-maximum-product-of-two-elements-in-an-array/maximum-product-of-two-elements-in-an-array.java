class Solution {
    public int maxProduct(int[] nums) {
    //    int max =0;
    //    int min =0;
    //    for(int i=0;i<nums.length;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         max = Math.max(max,((nums[i]-1) * (nums[j]-1)));
    //     }
    //    }
    //    return max;

        //better sol
        // int n = nums.length-1; 
        // Arrays.sort(nums);
        // return (nums[n]-1) * (nums[n-1]-1);
        
        // optimal

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num >= secondMax) {
                secondMax = num;
            }
        }
        return (firstMax-1) * (secondMax-1);
    }
}