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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(root.val);
        int ans;
        helper(root,list);
        Collections.sort(list);
        return list.get(k-1);
    }
    public void helper(TreeNode root,ArrayList<Integer> list){
        if(root==null) 
        {
            return;
        }           
        if(root.left!=null){
            list.add(root.left.val);
        }
        if(root.right!=null){
            list.add(root.right.val);
        }
        helper(root.left,list);
        helper(root.right,list);
    }
}