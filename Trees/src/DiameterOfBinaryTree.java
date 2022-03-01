
public class DiameterOfBinaryTree {
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
    public int diameter(TreeNode root){
        if(root==null){
            return 0;
        }
        int lheight=height(root.left);
        int rheight=height(root.right);

        int ldia=diameter(root.left);
        int rdia=diameter(root.right);

        return Math.max(lheight+rheight+1,Math.max(ldia,rdia));
    }
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1+Math.max(height(node.left),height(node.right));
    }
    public static void main(String[] args) {
        DiameterOfBinaryTree tree=new DiameterOfBinaryTree();
        TreeNode root= tree.createBinaryTree();
        int diameterofbinarytree=tree.diameter(root);
        System.out.println(diameterofbinarytree);
    }
}
