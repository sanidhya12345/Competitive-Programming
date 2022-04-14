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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) { return false; }
        return helper(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }
    
    private boolean helper(ListNode head, TreeNode root) {
        if (head == null) { return true; }
        if (root == null) { return false; }
        
        return head.val == root.val && (helper(head.next, root.left) || helper(head.next, root.right));
    }
}