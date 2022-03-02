/*
 * Copyright (c) 3-3/2/22, 2:28 PM by Sanidhya Varshney
 */

public class MinDepthBT {
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
    public int minimumdepthbt(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        if(root.left==null){
            return minimumdepthbt(root.right)+1;
        }
        if(root.right==null){
            return minimumdepthbt(root.left)+1;
        }
        return Math.min(minimumdepthbt(root.left),minimumdepthbt(root.right))+1;
    }
    public static void main(String[] args) {
        MinDepthBT tree=new MinDepthBT();
        TreeNode root= tree.createBinaryTree();
        int result= tree.minimumdepthbt(root);
        System.out.println(result);
    }
}
