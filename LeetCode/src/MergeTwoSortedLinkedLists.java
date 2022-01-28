package LeetCode.src;

public class MergeTwoSortedLinkedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode fakeHead = new ListNode(0);
        ListNode curr = fakeHead;
        while(l1 != null && l2 !=null){
            if(l1.val < l2.val){
                curr.next = l1;
                curr = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                curr = l2;
                l2 = l2.next;
            }
        }
        if(l1 != null) curr.next = l1;
        if(l2 != null) curr.next = l2;
        return fakeHead.next;
    }
}
