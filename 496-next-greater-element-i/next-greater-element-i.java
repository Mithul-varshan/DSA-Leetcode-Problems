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

        // Stack solution :
        HashMap <Integer , Integer> map = new HashMap<>();
        Stack <Integer> stack = new Stack();
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek() <= nums2[i]){
                stack.pop();
            }
            if(stack.isEmpty()) map.put(nums2[i],-1);
            else map.put(nums2[i], stack.peek());
            stack.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}