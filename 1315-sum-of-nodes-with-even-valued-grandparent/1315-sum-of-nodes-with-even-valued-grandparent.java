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
     int totalSum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        helper(root);
        return totalSum;
    }
    public  void helper(TreeNode root){
        if(root == null) return;
        TreeNode node = root;
        if(root.val%2 == 0){
                if(node.right != null && node.right.right != null)
                    totalSum += node.right.right.val;
                if(node.right != null && node.right.left != null)
                    totalSum += node.right.left.val;
                if(node.left != null && node.left.right != null)
                    totalSum += node.left.right.val;
                if(node.left != null && node.left.left != null)
                    totalSum += node.left.left.val;
        }
        helper(root.left);
        helper(root.right);
    }
}