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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode current = head;
        // ListNode prev = null;
        // while(current != null){
        //     ListNode t = current;
        //     current = current.next;
        //     t.next = prev;
        //     prev = t;
        // }
        // if(n == 1) {
        //     prev = prev.next;
        // }
        // else{
        //     ListNode prevTemp = prev;
        //     int count =0;
        //     while(prevTemp != null){
        //         count++;
        //         if(count == n-1){
        //             prevTemp.next = prevTemp.next.next;
        //             break;
        //         }
        //         prevTemp = prevTemp.next;
        //     }
        // }
        // ListNode prev2 = null;
        // while(prev != null){
        //     ListNode t2 = prev;
        //     prev = prev.next;
        //     t2.next = prev2;
        //     prev2 = t2;
        // }
        // return prev2;


        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        for(int i=0;i<n;i++) fast = fast.next;

        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}