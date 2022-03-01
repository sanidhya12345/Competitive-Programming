public class PathSum {
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
    public boolean hasPathSum(TreeNode root,int sum){
        boolean ans=false;
        int sub=sum-root.data;
        if(sub==0 && root.left==null && root.right==null){
            return ans=true;
        }
        if(root.left!=null){
            ans=ans || hasPathSum(root.left,sub);
        }
        if(root.right!=null){
            ans=ans || hasPathSum(root.right,sub);
        }
        return ans;
    }
    public static void main(String[] args) {
        PathSum tree=new PathSum();
        int sum=10;
        TreeNode root=tree.createBinaryTree();
        boolean ans= tree.hasPathSum(root,sum);
        System.out.println(ans);
    }
}
