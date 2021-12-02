package LeetCode.src;

import java.util.ArrayList;
import java.util.List;
class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class BinaryTreePreOrderTraversalLeetcode {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }
    public void preorder(TreeNode root, List<Integer> list) {
        if(root == null) return;

        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }
}
