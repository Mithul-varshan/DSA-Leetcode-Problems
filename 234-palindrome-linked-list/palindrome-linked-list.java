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
        ListNode th = head;
        StringBuilder sb = new StringBuilder();
        while(th != null){
            sb.append(th.val);
            th = th.next;
        }
        String original = sb.toString();
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);


    }
}