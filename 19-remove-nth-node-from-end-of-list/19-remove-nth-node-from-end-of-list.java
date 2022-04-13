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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head; 
        ListNode curr = head; 
        ListNode prev = null;
        int count = 0;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        if(count - n == 0) {
            return head.next;
        }
        int i = 0;
        while(i != count - n) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        prev.next = curr.next;
        return head;
    }
}