public class BST {
    public class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    private TreeNode root;
    public BST(int [] in){
        this.root=CreateTree(in,0,in.length-1);

    }
    private TreeNode CreateTree(int [] in,int lo,int hi){
        if(lo>hi) return null;
        int mid=(lo+hi)/2;
        TreeNode newnode=new TreeNode(in[mid]);
        newnode.left=CreateTree(in,lo,mid-1);
        newnode.right=CreateTree(in,mid+1,hi);
        return newnode;
    }
    public void displaypreorder(TreeNode root){
        if(root==null) return;
        System.out.print(root.data+" ");
        displaypreorder(root.left);
        displaypreorder(root.right);
    }
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};
        BST tree=new BST(arr);
        tree.displaypreorder(tree.root);
    }
}
