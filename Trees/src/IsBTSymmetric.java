/*
 * Copyright (c) 3-3/1/22, 4:41 PM by Sanidhya Varshney
 */

public class IsBTSymmetric {
    public static TreeNode root;
    private static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data=data;
        }
    }
    public TreeNode createBinaryTree(){
        TreeNode first= new TreeNode(1);
        TreeNode second= new TreeNode(2);
        TreeNode third= new TreeNode(3);
        TreeNode fourth= new TreeNode(4);
        TreeNode fifth= new TreeNode(5);
        TreeNode sixth= new TreeNode(6);
        TreeNode seventh= new TreeNode(7);
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
        third.left=sixth;
        third.right=seventh;
        return root;
    }
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    public static boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.data != q.data) return false;
        return isSymmetric(p.left, q.right)
                && isSymmetric(p.right, q.left);
    }
    public static void main(String[] args) {
        IsBTSymmetric tree=new IsBTSymmetric();
        TreeNode root= tree.createBinaryTree();
        boolean result= tree.isSymmetric(root);
        System.out.println(result);
    }
}
