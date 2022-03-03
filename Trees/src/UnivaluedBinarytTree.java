/*
 * Copyright (c) 3-3/3/22, 10:55 AM by Sanidhya Varshney
 */
public class UnivaluedBinarytTree {
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
    public boolean isUnivalTree(TreeNode root) {
        return helper(root,root.data);
    }
    public boolean helper(TreeNode root,int check){
        if(root==null){
            return true;
        }
        if(root.data!=check){
            return false;
        }
        return helper(root.left,check) && helper(root.right,check);
    }
    public static void main(String[] args) {
        UnivaluedBinarytTree tree=new UnivaluedBinarytTree();
        TreeNode root=tree.createBinaryTree();
        boolean test= tree.isUnivalTree(root);
        System.out.println(test);
    }
}
