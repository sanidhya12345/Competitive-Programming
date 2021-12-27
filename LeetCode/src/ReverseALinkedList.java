package LeetCode.src;
class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class ReverseALinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }

        ListNode newNode=head.next;
        head.next=null;

        while(newNode!=null){
            ListNode temp=newNode.next;
            newNode.next=head;
            head=newNode;
            newNode=temp;
        }
        return head;
    }
}

