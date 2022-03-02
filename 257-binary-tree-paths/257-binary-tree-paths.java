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
     List<String> res;
    public List<String> binaryTreePaths(TreeNode root) {
        res=new ArrayList<>();
        String s="";
        helper(root,s);
        return res;
    }
    void helper(TreeNode root, String s)
    {
        if(root.left==null && root.right==null)
        {
            res.add(s+root.val);
            return;
        }
        if(root.left!=null)helper(root.left,s+root.val+"->");
        if(root.right!=null)helper(root.right,s+root.val+"->");
    }
}