class Solution {
    public boolean uniformArray(int[] nums1) {
        // int n = nums1.length;
        // int evencount = 0;
        // int oddcount = 0;
        // int[] nums2 = new int[n];
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<n;j++){
        //         if(nums1[i] % 2 == 0){
        //             nums2[i] = nums1[i];
        //             evencount++;
        //             break;
        //         }
        //         else{
        //             if( (nums1[i] - nums1[j]) % 2 == 0 && i != j){
        //                 nums2[i] = nums1[i] - nums2[j];
        //                 evencount++;
        //                 break;
        //             }
        //         }
        //     }
        //     for(int j=0;j<n;j++){
        //         if(nums1[i] % 2 != 0){
        //             nums2[i] = nums1[i];
        //             oddcount++;
        //             break;
        //         }
        //         else{
        //             if( (nums1[i] - nums1[j]) % 2 != 0 && i != j){
        //                 nums2[i] = nums1[i] - nums2[j];
        //                 oddcount++;
        //                 break;
        //             }
        //         }
        //     }
        // }
        // return evencount == n || oddcount == n;
        return true;
    }
}