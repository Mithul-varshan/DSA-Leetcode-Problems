class Solution {
    public int missingNumber(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],0);
        // }
        // for(int i=0;i<=nums.length;i++){
        //     if(!map.containsKey(i)) return i;
        // }
        // return 0;
        int n = nums.length;
        int sum = 0;
        int rangeSum = (n*(n+1))/2;
        for(int num : nums){
            sum+=num;
        }
        return rangeSum - sum;
    }
}