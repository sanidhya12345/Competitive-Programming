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
     private int maxDepth(TreeNode root) {
            if(root == null) return 0;
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    
        private int depthSum(TreeNode root, int depth, int currentDepth) {
            if(root == null) return 0;
            if(currentDepth == depth){
                return root.val;
            }
            return depthSum(root.left, depth, currentDepth + 1) + depthSum(root.right, depth, currentDepth + 1);
        }
    
        public int deepestLeavesSum(TreeNode root) {
            int depth = maxDepth(root);
            return depthSum(root, depth, 1);
            
        }
   
}