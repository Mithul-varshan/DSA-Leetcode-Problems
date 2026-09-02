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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode p1 = list1;
        // ListNode p2 = list2;
        // ListNode dummy = new ListNode(0);
        // ListNode current = dummy;

        // while(p1 != null && p2 != null){
        //     if(p1.val <= p2.val){
        //         current.next = p1;
        //         p1 = p1.next;
        //         current = current.next;
        //     }
        //     else{
        //         current.next = p2;
        //         p2 = p2.next;
        //         current = current.next;
        //     }
        // }
        // //we do this if else for some cases were we have list like this : [1,2,3,4] , [1,2,3] loop stops when it reaches 3 so in dummy we will only have [1,2,3] 4 is missed so we are adding that here
        // if(p1 != null) current.next = p1;
        // else current.next = p2;
        // return dummy.next;
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(p1 != null && p2 != null){
            if(p1.val <= p2.val) {
                current.next = p1;
                p1 = p1.next;
                current = current.next;
            }
            else{
                current.next = p2;
                p2 = p2.next;
                current = current.next;
            }
        }
        if(p1 != null){
            current.next = p1;
        }
        else{
            current.next = p2;
        }
        return dummy.next;
    }
}