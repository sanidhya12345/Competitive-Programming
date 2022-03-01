/*import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt1 = m.new BinaryTree();
		System.out.println(bt1.levelArrayList());
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public ArrayList<ArrayList<Integer>> levelArrayList() {
			ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    if(this.root==null){
        return result;
    }

    LinkedList<Node> nodeQueue = new LinkedList<>();
    LinkedList<Integer> levelQueue = new LinkedList<>();

    nodeQueue.offer(root);
    levelQueue.offer(1);//start from 1

    while(!nodeQueue.isEmpty()){
        Node node = nodeQueue.poll();
        int level = levelQueue.poll();

        ArrayList<Integer> l=null;
        if(result.size()<level){
            l = new ArrayList<>();
            result.add(l);
        }else{
            l = result.get(level-1);
        }

        l.add(node.data);

        if(node.left!=null){
            nodeQueue.offer(node.left);
            levelQueue.offer(level+1);
        }

        if(node.right!=null){
            nodeQueue.offer(node.right);
            levelQueue.offer(level+1);
        }
    }

    return result;

		}

	}

}
*/