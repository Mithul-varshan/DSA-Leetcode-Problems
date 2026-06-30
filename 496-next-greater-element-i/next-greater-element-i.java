class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            int ans=-1;
            for(int j=0;j<nums2.length-1;j++){
                if(nums2[j] == nums1[i]){
                    for (int k=j+1;k<nums2.length;k++) {
                        if (nums2[k] > nums1[i]) {
                            ans = nums2[k];
                            break;
                        }
                    }
                    break; 
                }
            }
            nums1[i] = ans;
        }
        return nums1;
    }
}