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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            //size of each level
            int levelsize=q.size();
            int maxValue=Integer.MIN_VALUE;
            
            for(int i=0;i<levelsize;i++){
                TreeNode curr=q.poll();
                maxValue=Math.max(maxValue,curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            ans.add(maxValue);
        }
        return ans;
    }
}






