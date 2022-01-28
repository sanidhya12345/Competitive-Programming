public class FindTheBottomLeftVALUE {
    Node root;
    int maxdepth=0;
    int ans=0;
    public  int findBottomLeftValue(Node root) {
        findvalue(root,1);
        return ans;
    }
     void findvalue(Node node,int depth){
        if(node==null){
            return ;
        }
        if(node.left==null && node.right==null && depth>maxdepth){
            ans=node.data;
            maxdepth=depth;
        }
        findvalue(node.left,depth+1);
        findvalue(node.right,depth+1);
    }
    public static void main(String[] args) {
        FindTheBottomLeftVALUE tree=new FindTheBottomLeftVALUE();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Bottom Left Value:-"+tree.findBottomLeftValue(tree.root));
    }
}
