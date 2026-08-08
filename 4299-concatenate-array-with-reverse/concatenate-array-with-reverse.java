class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        for(int i=0;i<n;i++){
            if(i!=n) ans[i] = nums[i];
        }
        int index = n;
        for(int i=n-1;i>=0;i--){
            ans[index] = nums[i];
            index++;
        }
        return ans;

    }
}