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
     public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> tree1 = new ArrayList<>();
        ArrayList<Integer> tree2 = new ArrayList<>();
        traverseTree(root1,tree1);
        traverseTree(root2,tree2);
        int i = 0;
        int j = 0;
        while(i < tree1.size() && j < tree2.size()){
            if(tree1.get(i) != tree2.get(j)) return false;
            i++;
            j++;
        }
        return tree1.size() == tree2.size();
    }
    public void traverseTree(TreeNode root, List<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }
        traverseTree(root.left,list);
        traverseTree(root.right,list);
    }
    
}