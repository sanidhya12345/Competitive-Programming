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
   public int maxAncestorDiff(TreeNode root) {
        if(root == null)return 0;
        return helper(root,root.val,root.val);  
    }
    
    public int helper(TreeNode root,int currmax,int currmin){
      if(root==null)return currmax - currmin;
    
       currmax = Math.max(root.val,currmax);
       currmin = Math.min(root.val,currmin);
      
       int l = helper(root.left,currmax,currmin);
       int r = helper(root.right,currmax,currmin);
        
       return Math.max(l,r); 
    }
}