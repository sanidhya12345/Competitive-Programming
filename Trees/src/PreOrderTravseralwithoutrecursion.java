import java.util.Stack;

public class PreOrderTravseralwithoutrecursion {
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
    public void preorder(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> s=new Stack<>();
        s.push(root);

        while(s.empty()==false){
            TreeNode curr=s.peek();
            System.out.println(curr.data);
            s.pop();
            if(curr.right!=null){
                s.push(curr.right);
            }
            if (curr.left!=null){
                s.push(curr.left);
            }
        }
    }
    public static void main(String[] args) {
        PreOrderTravseralwithoutrecursion tree=new PreOrderTravseralwithoutrecursion();
        TreeNode root=tree.createBinaryTree();
        tree.preorder(root);
    }
}
