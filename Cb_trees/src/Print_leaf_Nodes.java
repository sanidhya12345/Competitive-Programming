/*import java.util.*;
public class Main {
    static Scanner sc;
    static Node root;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        root = null;
        createTree();
        findLeaves(root);
    }

    private static void findLeaves(Node root) {
        if(root == null) return;
        if(root.left == null && root.right == null){
            System.out.print(root.data + " ");
        }
        findLeaves(root.left);
        findLeaves(root.right);
    }

    private static void createTree() {

        root = new Node(sc.nextInt());
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rem = q.remove();
            if(rem != null && rem.data != -1){
                int left = sc.nextInt();
                int right = sc.nextInt();
                rem.left = left == -1 ? null : new Node(left);
                rem.right = right == -1 ? null : new Node(right);
                q.add(rem.left);
                q.add(rem.right);
            }

        }

    }

}


class Node{
    int data;
    Node left;
    Node right;
    Node(){};
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }

}
*/