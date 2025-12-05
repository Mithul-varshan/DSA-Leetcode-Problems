class Solution {
    public int countPartitions(int[] nums) {
        int a = 0;
        int c = 0;
        int b = nums.length-1;
        int sum = 0;
        int sum2 = 0;
        for (int i=0;i<nums.length-1;i++){
            sum += nums[i];
            for(int j = i+1;j<nums.length;j++){
                sum2 += nums[j];
            }
            // System.out.println(sum + " " + sum2);
            if (Math.abs(sum - sum2) % 2 == 0) {
                c++;
            }
            sum2 = 0;
        }
        return c;
    }
}