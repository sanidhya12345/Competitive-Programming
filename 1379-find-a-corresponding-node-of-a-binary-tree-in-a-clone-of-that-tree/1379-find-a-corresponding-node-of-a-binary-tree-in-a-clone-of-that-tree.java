/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return helper(cloned,original,target);
    }
    public final TreeNode helper(TreeNode root,TreeNode original,TreeNode target){
        if(root==null) return null;
        if(root.val==target.val) return root;
        TreeNode value1=helper(root.left,original,target);
        TreeNode value2=helper(root.right,original,target);
        if(value1!=null) return value1;
        if(value2!=null) return value2;
        return null;
    }
}