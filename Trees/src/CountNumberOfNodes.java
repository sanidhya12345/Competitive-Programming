public class CountNumberOfNodes {
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
    public static int countNumberOfNodes(TreeNode root){
        if (root==null){
            return 0;
        }
        return 1+countNumberOfNodes(root.left)+countNumberOfNodes(root.right);
    }
    public static void main(String[] args) {
        CountNumberOfNodes cnn=new CountNumberOfNodes();
        TreeNode root=cnn.createBinaryTree();
        int count=countNumberOfNodes(root);
        System.out.println("Number Of Nodes in Binary Tree:- "+count);
    }
}
