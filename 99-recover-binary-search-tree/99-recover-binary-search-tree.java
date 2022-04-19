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
    public TreeNode pre;
    public TreeNode post;
    private TreeNode pointer=new TreeNode(Integer.MIN_VALUE);
    public void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        if(pre==null && root.val<pointer.val){
            pre=pointer;
        }
        if(pre!=null && root.val<pointer.val){
            post=root;
        }
        pointer=root;
        helper(root.right);
    }
    public void recoverTree(TreeNode root) {
        pre=null;
        post=null;
        helper(root);
        int val=pre.val;
        pre.val=post.val;
        post.val=val;
    }
}