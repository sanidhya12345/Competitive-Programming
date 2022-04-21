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
     public TreeNode bstFromPreorder(int[] preorder) {
        return constructFromPreorder(preorder, 0, preorder.length-1);
    }
    
    public TreeNode constructFromPreorder(int[] pre, int start, int end) {
        if(start > end) {
            return null;
        }
        TreeNode node = new TreeNode(pre[start]);
        int index;
        for(index=start;index<=end;index++) {
            if(pre[index] > node.val) {
                break;
            }
        }
        node.left = constructFromPreorder(pre, start+1, index-1);
        node.right = constructFromPreorder(pre, index, end);
        return node;
    }
    
}