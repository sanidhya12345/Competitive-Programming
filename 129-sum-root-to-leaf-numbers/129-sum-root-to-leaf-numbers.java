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
    ArrayList<String> list=new ArrayList<>();
    private boolean isLeaf(TreeNode root){
        return root.left==null && root.right==null;
    }
    private void pathprint(TreeNode root,Deque<Integer> path){
        if(root==null){
            return;
        }
        path.addLast(root.val);
        if (isLeaf(root)) {
            helper(path);
        }
        pathprint(root.left, path);
        pathprint(root.right, path);
        path.removeLast();
    }
    public int sumNumbers(TreeNode root) {
        Deque<Integer> path = new ArrayDeque<>();
        pathprint(root, path);
        int sum=0;
        for(String i:list){
            sum+=Integer.parseInt(i);
        }
        return sum;
    }
    private void helper(Deque<Integer> path){
        String pathstring="";
        for(int i:path){
            pathstring+=i;
        }
        list.add(pathstring);
    }
}