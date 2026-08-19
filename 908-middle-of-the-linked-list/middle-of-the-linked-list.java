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
    public ListNode middleNode(ListNode head) {
        // ListNode curr = head;
        // ListNode curr2 = head;
        // int count=0;
        // while(curr != null){
        //     count++;
        //     curr = curr.next;
        // }
        // count/=2;
        // int index=0;
        // ListNode head2 = null;
        // while(curr2 != null){
        //     if(index == count){
        //         head2 = curr2;
        //         break;
        //     }
        //     index++;
        //     curr2 = curr2.next;
        // }
        // return head2;
    
        // using slow and fast pointer

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}