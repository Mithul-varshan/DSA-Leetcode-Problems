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
        int size =0;
        ListNode curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        if(size == 1) head = null;
        ListNode curr2 = head;
        int mid = size / 2; 
        int track = 0; 
        while(curr2 != null){
            if(track == mid-1){
                curr2.next = curr2.next.next;
            }
            track++;
            curr2 = curr2.next;
        }
        return head;
    }
}