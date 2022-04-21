/*
 * Copyright (c) 3/20/22, 4:14 PM by Sanidhya Varshney
 */

import java.util.Scanner;

public class Bt {
    static Node root;
    static class Node {
        String data;
        Node left, right;
        Node(String data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insertLevelOrder(String[] arr, Node root,int i)
    {
        if (i < arr.length) {
            Node temp = new Node(arr[i]);
            root = temp;
            root.left = insertLevelOrder(arr, root.left,
                    2 * i + 1);
            root.right = insertLevelOrder(arr, root.right,
                    2 * i + 2);
        }
        return root;
    }
    static boolean isMirror(Node node1, Node node2)
    {
        if (node1 == null && node2 == null) return true;
        if (node1 != null && node2 != null && node1.data == node2.data)
            return (isMirror(node1.left, node2.right)
                    && isMirror(node1.right, node2.left));
        return false;
    }
    public static boolean ArrayChallenge(String [] strArr){
        Node node=new Node(strArr[0]);
        root=insertLevelOrder(strArr,node,0);
        return isMirror(root,root);
    }

    public static void main(String[] args) {
        String arr[]={"4","3","4"};
        System.out.println(ArrayChallenge(arr));
    }
}
