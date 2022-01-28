package LeetCode.src;

public class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return head;
        }

        int length=0;

        for(ListNode current=head;current!=null;current=current.next){
            length+=1;
        }
        length=length/2;
        ListNode curr=head;
        while(length>0){
            curr=curr.next;
            length--;
        }
        return curr;
    }
}
