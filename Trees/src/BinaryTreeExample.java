
import java.util.Stack;

public class BinaryTreeExample {
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
    //Preorder Traversal of a binary tree.
    /*
    Steps for traversal:-
    1.Visiting the root.
    2.traversing the left subtree.
    3.traversing the right subtree.
    */
    public void preorder(TreeNode root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void preorderIterative(TreeNode root){
        if (root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }
    //Inorder traversal of tree....
    /*
    1.traversing the left subtree.
    2.visiting the root.
    3.traversing the right subtree.
    * */
    public void inorder(TreeNode root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public void postorder(TreeNode root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        BinaryTreeExample tree=new BinaryTreeExample();
        TreeNode root=tree.createBinaryTree();
        System.out.println("Pre-Order Traversal of the tree....");
        tree.preorder(root);
        System.out.println();
        System.out.println("In-Order Traversal of the tree....");
        tree.inorder(root);
        System.out.println();
        System.out.println("Post-Order Traversal of the tree....");
        tree.postorder(root);
        System.out.println();
        System.out.println("Pre-order Traversal using iteration....");
        tree.preorderIterative(root);
    }
}
