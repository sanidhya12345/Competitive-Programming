/*
 * Copyright (c) 3-3/8/22, 6:29 PM by Sanidhya Varshney
 */

public class SpecialBinaryTree {
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
        TreeNode third= new TreeNode(5);
        TreeNode fourth= new TreeNode(2);
        TreeNode fifth= new TreeNode(6);
        TreeNode sixth= new TreeNode(8);
        root=first;
        first.left=second;
        first.right=fourth;
        second.left=third;
        fourth.left=fifth;
        fourth.right=sixth;
        return root;
    }
    public static TreeNode special(TreeNode root){
        if(root.data!=1){
            root.data=1;
        }
        return helper(root);
    }
    public static TreeNode helper(TreeNode root){
        if(root==null){
            return null;
        }
        if(root.left!=null){
            if(root.left.data%2!=0){
                root.left.data=root.left.data-1;
            }
        }
        if(root.right!=null){
            if(root.right.data%2==0){
                root.right.data=root.right.data+1;
            }
        }
        helper(root.left);
        helper(root.right);
        return  root;
    }
    public static void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        SpecialBinaryTree tree=new SpecialBinaryTree();
        TreeNode root=tree.createBinaryTree();
        preOrder(root);
        System.out.println();
        special(root);
        preOrder(root);

    }
}
