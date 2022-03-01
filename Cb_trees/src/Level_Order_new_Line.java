/*import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderNewLine();
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

		public void levelOrderNewLine() {

			// write your code here
			Queue<Node> qq = new LinkedList<>();
		Queue<Node> helper = new LinkedList<>();

		qq.add(this.root);
		while (qq.isEmpty() == false) {

			Node rv = qq.remove();
			System.out.print(rv.data + " ");
			if (rv.left != null) {
				helper.add(rv.left);
			}
			if (rv.right != null) {
				helper.add(rv.right);

			}

			if (qq.isEmpty()) {
				qq = helper;
				helper = new LinkedList<>();
				System.out.println();
			}

		}
		}

	}

}
*/