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
    public boolean isPalindrome(ListNode head) {
        // ListNode current = head;
        // ListNode prev = null;
        // while(current != null){
        //     ListNode temp = current;
        //     current = current.next;
        //     temp.next = prev;
        //     prev = temp;
        // }
        // while(head != null && prev != null){
        //     if(head.val != prev.val) return false;
        //     head = head.next;
        //     prev = prev.next;
        // }
        // return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode  prev = null;
        ListNode curr = slow;
        while(curr != null) {
            ListNode temp = curr;
            curr = curr.next;
            temp.next = prev;
            prev = temp;
        }
        ListNode p1 = head;
        ListNode p2 = prev;
        while(p2 != null){
            if(p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}