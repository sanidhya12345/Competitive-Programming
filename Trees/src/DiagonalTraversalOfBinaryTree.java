/*
 * Copyright (c) 3-3/25/22, 6:52 PM by Sanidhya Varshney
 */

import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class DiagonalTraversalOfBinaryTree {
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
    private static void diagonalPrint(TreeNode root, int d, TreeMap<Integer, Vector<Integer>> dp){
        //Base Case
        if(root==null){
            return;
        }
        Vector<Integer> k=dp.get(d);
        if(k==null){
            k=new Vector<>();
            k.add(root.data);
        }
        else{
            k.add(root.data);
        }
        dp.put(d,k);
        diagonalPrint(root.left,d+1,dp);
        diagonalPrint(root.right,d,dp);
    }
    private static void printdiagonal(TreeNode root){
        TreeMap<Integer,Vector<Integer>> dp=new TreeMap<>();
        diagonalPrint(root,0,dp);
        for (Map.Entry<Integer, Vector<Integer>> entry :
                dp.entrySet())
        {
            System.out.println(entry.getValue());
        }
    }
    public static void main(String[] args) {
        DiagonalTraversalOfBinaryTree tree=new DiagonalTraversalOfBinaryTree();
        TreeNode root= tree.createBinaryTree();
        printdiagonal(root);
    }
}
