class Solution {
    public int pivotIndex(int[] nums) {
        int[] n = new int[nums.length];
        n[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            n[i] = n[i-1] + nums[i];
        }
        for(int i=0;i<nums.length;i++) {
            if(i == 0){
                if (n[nums.length-1] - n[i] == 0){
                    return i;
                }    
            }
            else if(n[nums.length-1] - n[i] == n[i-1]){
                return i;
            }
        }
        return -1;

    }
}