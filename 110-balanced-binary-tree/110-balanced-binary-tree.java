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
     boolean valid = true;
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        if(root.left == null && root.right==null)return true;
        getDp(root,0);
        return valid;
    }
    
    public int getDp(TreeNode root,int d) {
        if(root==null)return d;
        int l = getDp(root.left,d+1);
        int r = getDp(root.right,d+1);
        if(Math.abs(l-r) > 1) {
            valid = false;
        }
        return Math.max(l,r);
    }
}