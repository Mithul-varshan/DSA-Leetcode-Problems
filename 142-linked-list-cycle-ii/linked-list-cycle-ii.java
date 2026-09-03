/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode slow = head;
        ListNode fast = head;
        int index=0;
        int findex=0;
        while(slow != null && fast != null && fast.next != null){
            if(!map.containsKey(slow)){
                map.put(slow, index);
                index++;
            }
            else{
                return slow;
            }
            slow = slow.next;
            fast = fast.next.next;
            // if(slow == fast){
                
            // }
        }
        return null;
    }
}