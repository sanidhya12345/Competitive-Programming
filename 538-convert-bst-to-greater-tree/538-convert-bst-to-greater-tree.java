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
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null){
            return null;
        }
        helper(root);
        return root;
    }
    private void helper(TreeNode root){
        if(root.right!=null){
            helper(root.right);
        }
        sum+=root.val;
        root.val=sum;
        if(root.left!=null){
            helper(root.left);
        }
    }
}