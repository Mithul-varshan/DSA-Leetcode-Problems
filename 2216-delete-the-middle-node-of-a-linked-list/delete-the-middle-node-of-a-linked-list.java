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
    public ListNode deleteMiddle(ListNode head) {
        // int size =0;
        // ListNode curr = head;
        // while(curr != null){
        //     size++;
        //     curr = curr.next;
        // }
        // if(size == 1) head = null;
        // ListNode curr2 = head;
        // int mid = size / 2; 
        // int track = 0; 
        // while(curr2 != null){
        //     if(track == mid-1){
        //         curr2.next = curr2.next.next;
        //     }
        //     track++;
        //     curr2 = curr2.next;
        // }
        // return head;

        // tortoise and hare // slow fast pointers
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = slow;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
}