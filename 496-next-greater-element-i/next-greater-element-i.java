class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int[] ans = new int[nums1.length];
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0;i<nums2.length;i++){
        //     int flag = 1;
        //     for(int j=i+1;j<nums2.length;j++){
        //         if(nums2[i] < nums2[j]){
        //             flag = 0;
        //             map.put(nums2[i], nums2[j]);
        //             break;
        //         }
        //     }
        //     if(flag == 1) map.put(nums2[i], -1);
        // }
        // for(int i=0;i<nums1.length;i++){
        //     nums1[i] = map.get(nums1[i]);
        // }
        // return nums1;

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=nums2.length-1; i>=0;i--){
            while(!stack.isEmpty() && nums2[i] >= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()) map.put(nums2[i],-1);
            else map.put(nums2[i], stack.peek());
            stack.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}