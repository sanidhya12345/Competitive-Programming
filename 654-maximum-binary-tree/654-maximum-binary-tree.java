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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       return constructMaximumBinaryTree(nums,0,nums.length-1);
    }
    public TreeNode constructMaximumBinaryTree(int [] nums,int start,int end){
        if(start<0 || end>=nums.length|| start>end){
            return null;
        }
        int maxIndex=start,max=nums[start];
        for(int i=start+1;i<=end;i++){
            if(max<nums[i]){
                max=nums[i];
                maxIndex=i;
            }
        }
        TreeNode root=new TreeNode(max);
        root.left=constructMaximumBinaryTree(nums,start,maxIndex-1);
        root.right=constructMaximumBinaryTree(nums,maxIndex+1,end);
        return root;
    }
}