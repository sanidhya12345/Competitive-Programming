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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy=head;
        ArrayList<ListNode> list=new ArrayList<>();
        while(dummy!=null){
            list.add(dummy);
            dummy=dummy.next;
        }
        int length=list.size();
        int temp=list.get(k-1).val;
        list.get(k-1).val=list.get(length-k).val;
        list.get(length-k).val=temp;
        return head;
    }
}