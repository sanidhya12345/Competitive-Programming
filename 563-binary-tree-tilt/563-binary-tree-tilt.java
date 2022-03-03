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
     private int sum = 0;
    public int findTilt(TreeNode root) {
        preOrder(root);
        return sumTree(root);
    }
    
    public static void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        int s1 = sumTree(root.left);
        int s2 = sumTree(root.right);
        root.val = Math.abs(s1-s2);
        preOrder(root.left);
        preOrder(root.right);
    }
    
    
    public static int sumTree(TreeNode root){
        if(root == null){
            return 0;
        }
        return (root.val + sumTree(root.left) +sumTree(root.right));
    }
}