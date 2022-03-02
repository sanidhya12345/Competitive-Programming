public class CheckAllLeavesAtSameLevel {
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
    boolean checksamelevel(TreeNode root,int level,int leaflevel){
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            if(leaflevel==0){
                leaflevel=level;
                return true;
            }
            return level==leaflevel;
        }
        return checksamelevel(root.left,level+1,leaflevel) && checksamelevel(root.right,level+1,leaflevel);
    }
    public static void main(String[] args) {
        CheckAllLeavesAtSameLevel tree=new CheckAllLeavesAtSameLevel();
        TreeNode root= tree.createBinaryTree();
        boolean ans= tree.checksamelevel(root,0,0);
        System.out.println(ans);

    }
}

