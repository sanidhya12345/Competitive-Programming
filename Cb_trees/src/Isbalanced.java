/*import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced());
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

		public boolean isBalanced() {
			return this.isBalanced(this.root);
		}

		private boolean isBalanced(Node node) {
			// write your code here
            int lh;

        int rh;

        if (node == null)
            return true;

        lh = height(node.left);
        rh = height(node.right);

        if (Math.abs(lh - rh) <= 1
            && isBalanced(node.left)
            && isBalanced(node.right))
            return true;

        return false;

		}
        int height(Node node)
    {

        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
	}
}
*/