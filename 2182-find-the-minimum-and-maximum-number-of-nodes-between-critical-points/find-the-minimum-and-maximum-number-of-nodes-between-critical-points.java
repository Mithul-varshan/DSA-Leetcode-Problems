/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int [] arr = {-1, -1};
        Stack<Integer> st = new Stack<>();
        ListNode prev = head;
        ListNode temp = head.next;
        int index=1;
        while(temp != null){
            if( (temp.next != null) && 
                (
                    (prev.val < temp.val && temp.val > temp.next.val) || 
                    (prev.val > temp.val && temp.val < temp.next.val) 
                )
            )
            {
                st.push(index);
            }
            index++;
            temp = temp.next;
            prev = prev.next;

        }
        if(st.size() < 2){
            return arr;
        }
        int minDistance = Integer.MAX_VALUE;
        int pre = st.get(0);
        for(int i=1;i<st.size();i++){
            int curr = st.get(i);
            int distance = curr - pre;
            minDistance = Math.min(minDistance, distance);
            pre = curr;
        }
        int maxDistance = st.get(st.size()-1) - st.get(0);
        arr[0] = minDistance;
        arr[1] = maxDistance;
        return arr;
    }
}