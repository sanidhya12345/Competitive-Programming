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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        helper(root,arr);
        Collections.sort(arr);
        int l=0;
        int r=arr.size()-1;
        while(l<r)
    {
        if((arr.get(l)+arr.get(r))==k)
        {
            return true;
        }
        else if((arr.get(l)+arr.get(r))>k)
        {
            r--;
        }
        else if((arr.get(l)+arr.get(r))<k)
        {
            l++;
        }
    }
    return false;
    }
    private void helper(TreeNode root,ArrayList<Integer> list){
        if(root==null) return;
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
    }
}