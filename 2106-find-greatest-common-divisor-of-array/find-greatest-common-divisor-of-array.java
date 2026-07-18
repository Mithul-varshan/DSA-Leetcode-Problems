class Solution {
    int gcd(int min, int max){
        int temp = min;
        while(min > 0){
            min = max%min;
            max = temp;
            temp = min;
        }
        return max;
    }
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
        }
        return gcd(min,max);
    }
}