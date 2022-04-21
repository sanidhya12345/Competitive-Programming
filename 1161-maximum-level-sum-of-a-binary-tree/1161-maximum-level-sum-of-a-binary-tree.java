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
    public int maxLevelSum(TreeNode root) {
        int levels=getHeight(root);
        int [] ans=new int[levels];
        Sum(root,0,ans);
        int max=ans[0];
        int maxIndex=0;
        for(int i=0;i<levels;i++){
            if(max<ans[i]){
                max=ans[i];
                maxIndex=i;
            }
        }
        return maxIndex+1;
    }
    private int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(getHeight(root.left),getHeight(root.right));
    }
    static void Sum(TreeNode node, int level, int sum[])
    {
        if (node == null)
            return;
        sum[level] += node.val;
        Sum(node.left, level + 1, sum);
        Sum(node.right, level + 1, sum);
}
}