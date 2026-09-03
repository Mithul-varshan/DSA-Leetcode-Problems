class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
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
        //             if( (nums1[i] - nums2[j] >= 1) && ((nums1[i] - nums1[j]) % 2 == 0) && (i!=j) ){
        //                 nums2[i] = nums1[i] - nums1[j];
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
        //             if( (nums1[i] - nums1[j] >= 1) && ((nums1[i] - nums1[j]) % 2 != 0) && (i != j)){
        //                 nums2[i] = nums1[i] - nums1[j];
        //                 oddcount++;
        //                 break;
        //             }
        //         }
        //     }
        // }
        // if(oddcount == n || evencount == n) return true;
        // return false;
        int minodd = Integer.MAX_VALUE;
        int mineven = Integer.MAX_VALUE;
        for(int num : nums1){
            if(num%2 == 0) mineven = Math.min(mineven, num);
            else minodd = Math.min(minodd, num);
        }
        if(minodd == Integer.MAX_VALUE) return true;
        if(minodd < mineven) return true;
        return false;
    }
}