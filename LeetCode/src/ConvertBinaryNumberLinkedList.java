package LeetCode.src;

public class ConvertBinaryNumberLinkedList {
    public int getDecimalValue(ListNode head) {
        int length=0;
        for(ListNode current=head;current!=null;current=current.next){
            length++;
        }
        length=length-1;
        int ans=0;
        for(ListNode current=head;current!=null;current=current.next){
            ans=ans+(int)(current.val*Math.pow(2,length--));
        }
        return ans;
    }
}
