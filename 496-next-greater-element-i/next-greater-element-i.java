class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            int result=-1;
            for(int j=0;j<nums2.length-1;j++){
                if(nums2[j] == nums1[i]){
                    for(int k=j;k<nums2.length;k++){
                        if(nums2[k] > nums1[i]){
                            result = nums2[k];
                            break;
                        }
                    }
                }
            }
            nums1[i] = result;
        }
        return nums1;
    }
}