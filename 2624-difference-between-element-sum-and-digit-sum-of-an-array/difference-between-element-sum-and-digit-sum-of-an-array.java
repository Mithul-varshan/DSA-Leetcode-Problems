class Solution {
    public int elementSum(int[] nums){
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public int digitSum(int num){
        int sum=0;
        while(num > 0){
            int digit = num % 10;
            sum+=digit;
            num = num /10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int elementSum = elementSum(nums);
        int digitSum = 0;
        for(int i=0;i<nums.length;i++){
            String s = String.valueOf(nums[i]);
            if(s.length() > 1){
                digitSum += digitSum(nums[i]);
            }
            else{
                digitSum+=nums[i];
            } 
        }
        return Math.abs(elementSum - digitSum);
    }
}