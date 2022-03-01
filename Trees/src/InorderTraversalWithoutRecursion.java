/*
 * Copyright (c)  3/1/22, 4:29 PM by Sanidhya Varshney.
 */

import java.util.Stack;
public class InorderTraversalWithoutRecursion {
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
    public void inorder(TreeNode root){
        if (root==null){
            return;
        }
        Stack<TreeNode> s=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || s.size()>0){
            while(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            System.out.println(curr.data);
            curr=curr.right;
        }
    }
    public static void main(String[] args) {
        InorderTraversalWithoutRecursion tree=new InorderTraversalWithoutRecursion();
        TreeNode root=tree.createBinaryTree();
        tree.inorder(root);

    }
}
