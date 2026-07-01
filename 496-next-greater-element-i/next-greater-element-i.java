class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // for(int i=0;i<nums1.length;i++){
        //     int ans=-1;
        //     for(int j=0;j<nums2.length-1;j++){ 
        //         if(nums2[j] == nums1[i]){
        //             for (int k=j+1;k<nums2.length;k++) {
        //                 if (nums2[k] > nums1[i]) {
        //                     ans = nums2[k];
        //                     break;
        //                 }
        //             }
        //             break; 
        //         }
        //     }
        //     nums1[i] = ans; 
        // }
        // return nums1;
        HashMap <Integer , Integer> hm = new HashMap<>();
        Stack <Integer> s = new Stack();
        int [] res = new int[nums1.length];
        for (int ele : nums2){
            while (!s.isEmpty() && s.peek()< ele){
                hm.put(s.pop(),ele);
            }
            s.push (ele);
            
            for (int i=0 ; i < nums1.length ; i++){
                res[i] = hm.containsKey(nums1[i])?hm.get(nums1[i]):-1;
            }
        }
        return res;
    }
}