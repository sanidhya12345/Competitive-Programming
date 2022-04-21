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
    Long firstMin = Long.MAX_VALUE;
    Long secondMin = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        inorder(root);
        return secondMin!=Long.MAX_VALUE?secondMin.intValue():-1;
    }
    public void inorder(TreeNode root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        if(root.val<firstMin){
            secondMin = Long.valueOf(firstMin);
            firstMin =  Long.valueOf(root.val);
        }
        else if(root.val<=secondMin && root.val!=firstMin){
            secondMin = Long.valueOf(root.val);
        }
        inorder(root.right);
    }
}