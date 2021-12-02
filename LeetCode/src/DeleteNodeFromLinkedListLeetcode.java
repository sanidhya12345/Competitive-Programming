package LeetCode.src;

public class DeleteNodeFromLinkedListLeetcode {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public void deleteNode(ListNode node) {
        ListNode temp = node.next;
        node.val = temp.val;
        node.next = temp.next;
        temp = null;
    }
}
