/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // HashMap<ListNode,Integer> map = new HashMap<>();
        // ListNode slow = head;
        // int index =0;
        // while(slow != null){
        //     if(!map.containsKey(slow)){
        //         map.put(slow, index);
        //         index++;
        //     }
        //     else{
        //         return slow;
        //     }
        //     slow = slow.next;
        // }
        // return null;

        ListNode slow = head;
        ListNode fast = head;
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                if(slow ==fast) return slow;
            }
        }
        return null;
    }
}