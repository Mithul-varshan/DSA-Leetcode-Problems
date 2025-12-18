class Solution {
    public int[] buildArray(int[] nums) {
        ArrayList<Integer> n = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            n.add(nums[nums[i]]);
        }
        int[] result = new int[n.size()];
        for(int i=0;i<n.size();i++){
            result[i] = n.get(i);
        }
        return result;
    }
}