import java.util.Map;
import java.util.TreeMap;

public class BottomViewOfBinaryTree {
    Node root;
    public static void bottomView(Node node, TreeMap<Integer,Node> map,int step){
        if(node==null){
            return;
        }
        map.put(step,node);
        bottomView(node.left,map,step-1);
        bottomView(node.right,map,step+1);
    }
    public static void main(String[] args) {
        BottomViewOfBinaryTree tree=new BottomViewOfBinaryTree();
        TreeMap<Integer,Node> map=new TreeMap<>();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        bottomView(tree.root, map,0);

        for(Map.Entry<Integer,Node> nodes:map.entrySet()){
            System.out.println(nodes.getValue().data);
        }
    }
}
