package Trees;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	private int size;

	public BinaryTree() {
		Scanner scn = new Scanner(System.in);
		root = takeInput(null, true, scn);
	}

	public BinaryTree(int[] post, int[] in) {
		root = construct(post, in, 0, post.length - 1, 0, in.length - 1);
	}

	private Node construct(int[] post, int[] in, int psi, int pei, int isi, int iei) {
		if (psi > pei || isi > iei) {
			return null;
		}

		Node node = new Node();
		node.data = post[pei];

		int idx = -1;
		for (int i = isi; i <= iei; i++) {
			if (node.data == in[i]) {
				idx = i;
				break;
			}
		}

		int nelonright = iei - idx;

		node.left = construct(post, in, psi, pei - nelonright - 1, isi, idx - 1);
		node.right = construct(post, in, pei - nelonright, pei - 1, idx + 1, iei);

		return node;
	}

	// write using pre and in also (in notebook)

	private Node takeInput(Node parent, boolean ilc, Scanner scn) {
		if (parent == null) {
			System.out.println("enter root");
		} else {
			if (ilc == true) {
				System.out.println("enter left child for " + parent.data);
			} else {
				System.out.println("enter right child for " + parent.data);
			}
		}

		int data = scn.nextInt();

		Node node = new Node();
		node.data = data;
		this.size++;

		System.out.println("Does " + node.data + " hava a left child?");
		boolean hlc = scn.nextBoolean();
		if (hlc) {
			node.left = takeInput(node, true, scn);
		}

		System.out.println("does " + node.data + " have a right child?");
		boolean hrc = scn.nextBoolean();
		if (hrc) {
			node.right = takeInput(node, false, scn);
		}

		return node;
	}

	public int size() {
		return this.size;
	}

	public void display() {
		display(root);
	}

	private void display(Node node) {

		if (node == null) {
			return;
		}

		String str = "";
		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}

		str += " <= ";
		str += node.data + " => ";

		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}

		System.out.println(str);

		display(node.left);
		display(node.right);
	}

	public boolean isEmpty() {
		if (this.size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int size2() {
		return size2(root);
	}

	private int size2(Node node) {

		if (node == null) {
			return 0;
		}

		int lsize = size2(node.left);
		int rsize = size2(node.right);
		int size = lsize + rsize + 1;

		return size;
	}

	public boolean find(int data) {
		return find(root, data);
	}

	private boolean find(Node node, int data) {
		if (node == null) {
			return false;
		}

		if (node.data == data) {
			return true;
		}

		boolean checkl = find(node.left, data);
		if (checkl == true) {
			return true;
		}

		boolean checkr = find(node.right, data);
		if (checkr == true) {
			return true;
		}

		return false;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}

		int lmax = max(node.left);
		int rmax = max(node.right);
		return Math.max(Math.max(lmax, rmax), node.data);
	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {

		if (node == null) {
			return -1;
		}

		int lefth = height(node.left);
		int righth = height(node.right);
		return Math.max(lefth, righth) + 1;
	}

	public int diameter() {
		return diameter(root);
	}

	private int diameter(Node node) { // O(n^2)

		if (node == null) {
			return 0;
		}

		int lh = height(node.left);
		int rh = height(node.right);
		int f1 = lh + rh + 2;// distance between deepest of left and right
								// (factor 1)

		int f2 = diameter(node.left); // distance between deepest of left
										// (factor 2)
		int f3 = diameter(node.right); // distance between deepest of right
										// (factor 3)

		return Math.max(Math.max(f1, f2), f3);
	}

	public int diameter2() {
		return diameter2(root).dia;
	}

	private DiaPair diameter2(Node node) { // O(n)
		if (node == null) {
			DiaPair br = new DiaPair();
			br.height = -1;
			br.dia = 0;
			return br;
		}

		DiaPair lp = diameter2(node.left);
		DiaPair rp = diameter2(node.right);

		int f1 = lp.height + rp.height + 2;
		int f2 = lp.dia;
		int f3 = rp.dia;

		DiaPair mp = new DiaPair();
		mp.height = Math.max(lp.height, rp.height) + 1;
		mp.dia = Math.max(f1, Math.max(f2, f3));

		return mp;
	}

	private class DiaPair {
		int height;
		int dia;
	}

	public boolean isBalanced() {
		return isBalanced(root).check;
	}

	private isBalPair isBalanced(Node node) {
		if (node == null) {
			isBalPair bp = new isBalPair();
			bp.height = -1;
			bp.check = true;

			return bp;
		}

		isBalPair lp = isBalanced(node.left);
		isBalPair rp = isBalanced(node.right);

		isBalPair mp = new isBalPair();
		mp.height = Math.max(lp.height, rp.height) + 1;

		if (Math.abs(lp.height - rp.height) <= 1) {
			mp.check = true;
		}
		if (lp.check == false || rp.check == false) {
			mp.check = false;
		}

		return mp;
	}

	private class isBalPair {
		int height;
		boolean check;

	}

	public boolean isBST() {
		System.out.println("largest root " + isBST(root).largestBSTroot.data); // largest
																				// BST
		System.out.println("largest size " + isBST(root).largestBSTsize);
		return isBST(root).isBst;
	}

	private BST isBST(Node node) {
		if (node == null) {
			BST bt = new BST();
			bt.max = Integer.MIN_VALUE;
			bt.min = Integer.MAX_VALUE;
			bt.isBst = true;
			bt.largestBSTroot = null;
			bt.largestBSTsize = 0;
			return bt;
		}

		BST lt = isBST(node.left);
		BST rt = isBST(node.right);

		BST mt = new BST();
		mt.min = Math.min(Math.min(lt.min, rt.min), node.data);
		mt.max = Math.max(Math.max(lt.max, rt.max), node.data);
		if (lt.isBst && rt.isBst && node.data > lt.max && node.data < rt.min) {
			mt.isBst = true;
			mt.largestBSTsize = lt.largestBSTsize + rt.largestBSTsize + 1;
			mt.largestBSTroot = node;
		} else {
			mt.isBst = false;
			if (lt.largestBSTsize > rt.largestBSTsize) {
				mt.largestBSTsize = lt.largestBSTsize;
				mt.largestBSTroot = lt.largestBSTroot;
			} else {
				mt.largestBSTsize = rt.largestBSTsize;
				mt.largestBSTroot = rt.largestBSTroot;
			}
		}

		return mt;
	}

	private class BST {
		int min;
		int max;
		boolean isBst;
		Node largestBSTroot;
		int largestBSTsize;
	}

	public void preOrder() {
		preOrder(root);
		System.out.println(".");
	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + ", ");

		preOrder(node.left);
		preOrder(node.right);
	}

	public void postOrder() {
		postOrder(root);
		System.out.println(".");
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + ", ");
	}

	public void inOrder() {
		inOrder(root);
		System.out.println(".");
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.data + ", ");
		inOrder(node.right);
	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(root);

		while (queue.size() != 0) {
			Node temp = queue.removeFirst();
			System.out.print(temp.data + ", ");

			if (temp.left != null) {
				queue.addLast(temp.left);
			}
			if (temp.right != null) {
				queue.addLast(temp.right);
			}
		}
		System.out.println(".");
	}

	public void preOrderI() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(root);

		while (queue.size() != 0) {
			Node temp = queue.removeFirst();
			System.out.print(temp.data + ", ");

			if (temp.right != null) {
				queue.addFirst(temp.right);
			}

			if (temp.left != null) {
				queue.addFirst(temp.left);
			}
		}
		System.out.println(".");
	}

	private class TraversalPair {
		Node node;
		boolean selfDone;
		boolean leftDone;
		boolean rightDone;
	}

	public void preOrderItr() {
		LinkedList<TraversalPair> stack = new LinkedList<>();

		TraversalPair rootPair = new TraversalPair();
		rootPair.node = root;
		stack.addFirst(rootPair);

		while (stack.size() != 0) {
			TraversalPair topPair = stack.getFirst();

			if (topPair.selfDone == false) {
				System.out.print(topPair.node.data + ", ");
				topPair.selfDone = true;
			} else if (topPair.leftDone == false) {

				if (topPair.node.left != null) {
					TraversalPair lp = new TraversalPair();
					lp.node = topPair.node.left;
					stack.addFirst(lp);
				}
				topPair.leftDone = true;

			} else if (topPair.rightDone == false) {
				if (topPair.node.right != null) {
					TraversalPair rp = new TraversalPair();
					rp.node = topPair.node.right;
					stack.addFirst(rp);
				}

				topPair.rightDone = true;

			} else {
				stack.removeFirst();
			}
		}

		System.out.println(".");
	}

	public void postOrderItr() {
		LinkedList<TraversalPair> stack = new LinkedList<>();

		TraversalPair rootPair = new TraversalPair();
		rootPair.node = root;
		stack.addFirst(rootPair);

		while (stack.size() != 0) {
			TraversalPair topPair = stack.getFirst();

			if (topPair.leftDone == false) {

				if (topPair.node.left != null) {
					TraversalPair lp = new TraversalPair();
					lp.node = topPair.node.left;
					stack.addFirst(lp);
				}
				topPair.leftDone = true;

			} else if (topPair.rightDone == false) {
				if (topPair.node.right != null) {
					TraversalPair rp = new TraversalPair();
					rp.node = topPair.node.right;
					stack.addFirst(rp);
				}

				topPair.rightDone = true;

			} else if (topPair.selfDone == false) {
				System.out.print(topPair.node.data + ", ");
				topPair.selfDone = true;

			} else {
				stack.removeFirst();
			}

		}
		System.out.println(".");
	}

	public void inOrderItr() {
		LinkedList<TraversalPair> stack = new LinkedList<>();

		TraversalPair rootPair = new TraversalPair();
		rootPair.node = root;
		stack.addFirst(rootPair);

		while (stack.size() != 0) {
			TraversalPair topPair = stack.getFirst();

			if (topPair.leftDone == false) {

				if (topPair.node.left != null) {
					TraversalPair lp = new TraversalPair();
					lp.node = topPair.node.left;
					stack.addFirst(lp);
				}
				topPair.leftDone = true;
			} else if (topPair.selfDone == false) {
				System.out.print(topPair.node.data + ", ");
				topPair.selfDone = true;

			} else if (topPair.rightDone == false) {
				if (topPair.node.right != null) {
					TraversalPair rp = new TraversalPair();
					rp.node = topPair.node.right;
					stack.addFirst(rp);
				}

				topPair.rightDone = true;
			} else {
				stack.removeFirst();
			}
		}
		System.out.println(".");
	}

	public void printWithoutSiblings() {
		printWithoutSiblings(root);
	}

	private void printWithoutSiblings(Node node) {
		if (node == null) {
			return;
		}

		if (node.left == null && node.right != null) {
			System.out.print(node.right.data + ", ");
		} else if (node.left != null && node.right == null) {
			System.out.print(node.left.data + ", ");

		} else {

		}

		printWithoutSiblings(node.left);
		printWithoutSiblings(node.right);

	}

	public void removeAllLeaves() {
		removeAllLeaves(root, null, false);
	}

	private void removeAllLeaves(Node node, Node parent, boolean ilc) {
		if (node == null) {
			return;
		}

		if (node.left == null && node.right == null) {
			if (ilc) {
				parent.left = null;
			} else {
				parent.right = null;
			}
		}

		removeAllLeaves(node.left, node, true);
		removeAllLeaves(node.right, node, false);

	}

	public void largestPathSumToTarget(int target) { // from root to leaf
		largestPathSumToTarget(target, root, "", false);
	}

	private void largestPathSumToTarget(int target, Node node, String s, boolean ilc) {
		if (node == null) {
			if (target == 0 && ilc == true) {
				System.out.println(s);
			}
			return;
		}

		largestPathSumToTarget(target - node.data, node.left, s + node.data + ", ", true);
		largestPathSumToTarget(target - node.data, node.right, s + node.data + ", ", false);

	}
	
	

}
