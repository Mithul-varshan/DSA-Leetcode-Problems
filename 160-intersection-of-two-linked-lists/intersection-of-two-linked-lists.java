/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // ListNode current = headA;
        // ListNode current2 = headB;
        // while(current != null){
        //     ListNode temp = current2;
        //     while(temp != null){
        //         if(current == temp) return current;
        //         temp=temp.next;
        //     }
        //     current=current.next;
        // }
        // return null;

        // ListNode curr = headA;
        // ListNode curr2 = headB;
        // while(curr != null || curr2 != null) {
        //     if(curr == null) curr = headA;
        //     if(curr2 == null) curr2 = headB;
        //     if(curr2 == curr) return curr;
        //     curr = curr.next;
        //     curr2 = curr2.next;
        // }
        // return null;
        ListNode current = headA;
        ListNode current2 = headB;
        while (current != current2) {
            if (current == null) current = headB;
            else current = current.next;
            if (current2 == null) current2 = headA;
            else current2 = current2.next;
        }
        return current;
    }
}