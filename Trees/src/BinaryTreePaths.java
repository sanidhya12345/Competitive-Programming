/*
 * Copyright (c) 3-3/8/22, 7:59 PM by Sanidhya Varshney
 */

public class BinaryTreePaths {
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
    void btpaths(TreeNode root){
        String ans="";
        if(root.left==null && root.right==null){
            System.out.println(ans);
        }
        if(root.left!=null){
            ans+=root.left.data+"->";
        }
        if(root.right!=null){
            ans+=root.right.data+"->";
        }
    }
    public static void main(String[] args) {
        BinaryTreePaths tree=new BinaryTreePaths();
        TreeNode root= tree.createBinaryTree();
        tree.btpaths(root);
    }
}
