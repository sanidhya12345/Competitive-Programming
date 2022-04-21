/*
 * Copyright (c) 3-3/8/22, 7:59 PM by Sanidhya Varshney
 */

import java.util.Stack;

public class Zig_Zag_Traversal {
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
    public void zigzag(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> currentlevel=new Stack<>();
        Stack<TreeNode> nextlevel=new Stack<>();
        currentlevel.push(root);
        boolean lefttoright=false;
        while(!currentlevel.isEmpty()){
            TreeNode node=currentlevel.pop();
            System.out.print(node.data+" ");
            if(lefttoright){
                if(node.left!=null){
                    nextlevel.push(node.left);
                }
                if(node.right!=null){
                    nextlevel.push(node.right);
                }
            }
            else{
                if(node.left!=null){
                    nextlevel.push(node.left);
                }
                if(node.right!=null){
                    nextlevel.push(node.right);
                }
            }
            if (currentlevel.isEmpty()){
                lefttoright=!lefttoright;
                Stack<TreeNode> temp=currentlevel;
                currentlevel=nextlevel;
                nextlevel=temp;
            }
        }
    }
    public static void main(String[] args) {
        Zig_Zag_Traversal tree=new Zig_Zag_Traversal();
        TreeNode root=tree.createBinaryTree();
        tree.zigzag(root);
    }
}
