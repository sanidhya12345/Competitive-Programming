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
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return ans;
    }
    private void helper(TreeNode root){
        if(root==null) return;
        int sum=sumOftree(root);
        int count=count(root);
        if(sum/count==root.val){
            ans++;
        }
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
    }
    private int sumOftree(TreeNode root){
      if(root==null) return 0;
      return root.val+sumOftree(root.left)+sumOftree(root.right);
  }
    private int count(TreeNode root){
        if(root==null) return 0;
        return 1+count(root.left)+count(root.right);
    }
}