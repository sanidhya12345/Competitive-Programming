public class HeightOftree {
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
    public static int heightoftree(TreeNode node){
        if(node==null){
            return -1;
        }
        else{
            int leftdepth=heightoftree(node.left);
            int rightdepth=heightoftree(node.right);
            if(leftdepth>rightdepth){
                return leftdepth+1;
            }
            else{
                return rightdepth+1;
            }
        }
    }
    public static void main(String[] args) {
        HeightOftree tree=new HeightOftree();
        TreeNode root=tree.createBinaryTree();
        System.out.println(heightoftree(root));
    }
}
