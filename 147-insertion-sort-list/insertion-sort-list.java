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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null)   {
            return head;
        }

        ListNode dummy = new ListNode(0);

        while(head != null){
            ListNode next = head.next;
            ListNode prev = dummy;

            while(prev.next != null && prev.next.val < head.val){
                prev = prev.next;
            }
            head.next = prev.next;
            prev.next = head;

            head = next;
        }
        return dummy.next;
    }
}