class Solution {
    int gcd(int min, int max){
        int gcd=1;
        for(int i=1;i<=min;i++){
            if(min%i==0 && max%i==0){
                if(i > gcd) gcd = i;
            }
        }
        return gcd;
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