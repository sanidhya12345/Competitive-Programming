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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> answerList=new ArrayList<>();
        helperbt1(root1,answerList);
        helperbt2(root2,answerList);
        Collections.sort(answerList);
        return answerList;
    }
    private void helperbt1(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return ;
        }
        list.add(root.val);
        helperbt1(root.left,list);
        helperbt1(root.right,list);
    }
    private void helperbt2(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return ;
        }
        list.add(root.val);
        helperbt2(root.left,list);
        helperbt2(root.right,list);
    }
}