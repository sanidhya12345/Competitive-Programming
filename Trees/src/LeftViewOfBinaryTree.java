class Node{
    int data;
    Node left;
    Node right;
    public Node(int item){
        this.data=item;
        this.left=null;
        this.right=null;
    }
}

public class LeftViewOfBinaryTree {
    Node root;
    static int max_level=0;
    public static void leftView(Node node,int level){
        if(node==null){
            return;
        }
        if(max_level<level){
            System.out.print(node.data+" ");
            max_level=level;
        }
        leftView(node.left,level+1);
        leftView(node.right,level+1);
    }
    public void printleftview(){
        leftView(root,1);
    }
    public static void main(String[] args) {
        LeftViewOfBinaryTree tree=new LeftViewOfBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.printleftview();
    }
}