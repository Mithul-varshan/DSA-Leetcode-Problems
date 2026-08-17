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
        ListNode current = headA;
        ListNode current2 = headB;
        while(current != null){
            ListNode temp = current2;
            while(temp != null){
                if(current == temp) return current;
                temp=temp.next;
            }
            current=current.next;
        }
        return null;
    }
}