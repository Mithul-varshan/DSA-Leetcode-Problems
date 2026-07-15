class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for(int num : nums){
            if(num == 0) zeros++;
            if(num == 1) ones++;
            if(num == 2) twos++;
        }
        for(int i=0;i<nums.length;i++){
            if(zeros > 0){
                zeros--;
                nums[i] = 0;  
            }     
            else if(ones > 0){
                ones--;
                nums[i] = 1;
            }
            else if(twos > 0){
                twos--;
                nums[i] = 2;
            }     
        }
    }
}