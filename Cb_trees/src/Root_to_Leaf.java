

import java.util.Scanner;

public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		int T = scn.nextInt();
		bt.rootleaf(T);
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

		public void rootleaf(int T) {
			this.rootleaf(this.root, 0, T, "");
		}

		private void rootleaf(Node node, int sum, int T, String str) {
			if (sum + node.data == T && node.left == null && node.right == null) {
				System.out.println(str + node.data);
				return;
			}
			else if( node.left ==null && node.right == null) {
				return;
			}
			sum = sum + node.data;
			rootleaf(node.left, sum, T, str + "" + node.data + " ");
			rootleaf(node.right, sum, T, str + "" + node.data + " ");
		}
	}

}
