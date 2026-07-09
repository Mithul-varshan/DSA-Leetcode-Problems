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
        while(headA != null){
            ListNode th =headB;
            while(th != null){
                if(headA == th){
                    return th;
                }
                th = th.next;
            }
            headA = headA.next;    
        }
        return null;
    }
}