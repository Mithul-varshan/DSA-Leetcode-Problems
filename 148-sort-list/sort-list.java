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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> l = new ArrayList<>();
        ListNode temp = head;
        ListNode temp2 = head;
        while(temp != null){
            l.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(l);
        int index=0;
        while(temp2 != null){
            temp2.val = l.get(index++);
            temp2=temp2.next;
        }
        return head;

    }
}