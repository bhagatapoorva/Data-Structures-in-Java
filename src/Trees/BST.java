package Trees;

import java.util.LinkedList;
import java.util.Scanner;

public class BST {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	private int size;

	public BST(int[] post, int[] in) {
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

	public BST(int[] sa) {
		root = construct(sa, 0, sa.length - 1);
	}

	private Node construct(int[] sa, int lo, int hi) { // using only in order
														// array
		if (lo > hi) {
			return null;
		}
		Node node = new Node();
		this.size++;
		node.data = sa[(lo + hi) / 2];

		node.left = construct(sa, lo, ((lo + hi) / 2) - 1);
		node.right = construct(sa, ((lo + hi) / 2) + 1, hi);

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

		if (data > node.data) {
			return find(node.right, data);
		} else if (data < node.data) {
			return find(node.left, data);
		} else {
			return true;
		}

	}

	public void add(int data) {
		if (this.size == 0) {
			Node node = new Node();
			this.size++;
			node.data = data;
			this.root = node;
		} else {
			add(root, data);
		}
	}

	private void add(Node node, int data) {
		if (data > node.data) {
			if (node.right != null) {
				add(node.right, data);
			} else {
				Node child = new Node();
				this.size++; // important
				child.data = data;
				node.right = child;
			}
		} else if (data < node.data) {
			if (node.left != null) {
				add(node.left, data);
			} else {
				Node child = new Node();
				this.size++;
				child.data = data;
				node.left = child;
			}
		} else {
			// do nothing
		}
	}

	public void remove(int data) {
		remove(data, root, null, false);
	}

	private void remove(int data, Node node, Node parent, boolean ilc) {
		// base case not required cuz we assume data necessarily exists in the
		// bst
		// if not assumed then base case would be
		// if(node == null){
		// return;
		// }

		if (data > node.data) {
			remove(data, node.right, node, false);
		} else if (data < node.data) {
			remove(data, node.left, node, true);
		} else {
			if (node.left == null && node.right == null) {
				if (ilc == true) {
					parent.left = null;
					this.size--;
				} else {
					parent.right = null;
					this.size--;
				}

			} else if (node.right == null) {
				if (ilc == true) {
					parent.left = node.left;
				} else {
					parent.right = node.left;
					// node.left = null; not required cuz agar koi humein nahi
					// point kar raha toh we're automatically gone in garbage
					// collector
				}
				this.size--;

			} else if (node.left == null) {
				if (ilc == true) {
					parent.left = node.right;
				} else {
					parent.right = node.right;
				}
				this.size--;

			} else {
				node.data = max(node.left);
				remove(node.data, node.left, node, true); // could also use
															// right.min
			}
		}
	}

	public void removeUsingTernaryOperator(int data) {
		removeUsingTernaryOperator(null, root, false, data);
	}

	private void removeUsingTernaryOperator(Node parent, Node node, boolean ilc, int data) {

		if (data > node.data) {
			removeUsingTernaryOperator(node, node.right, false, data);
		} else if (data < node.data) {
			removeUsingTernaryOperator(node, node.left, true, data);
		} else {
			// reached
			if (node.left != null && node.right != null) {
				node.data = min(node.right);
				removeUsingTernaryOperator(node, node.right, false, node.data);
			} else {
				this.size--;
				if (ilc) {
					parent.left = (node.left != null ? node.left : node.right);
				} else {
					parent.right = (node.left != null ? node.left : node.right);
				}
			}
		}
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {

		if (node.right != null) {
			return max(node.right);
		} else {
			return node.data;
		}

	}

	public int min() {
		return min(root);
	}

	private int min(Node node) {
		if (node.left != null) {
			return min(node.left);
		} else {
			return node.data;
		}
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
			;
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
	
	private class StoreSum{
		int sum;
	}
	
	public void replaceWithSumOfLarger(){
		StoreSum sumv = new StoreSum();
		replaceWithSumOfLarger(root,  sumv);
	}
	
	private void replaceWithSumOfLarger(Node node, StoreSum sumv){
		if(node == null){
			return;
		}
	
		replaceWithSumOfLarger(node.right, sumv);
		
		int temp1 = node.data;
		node.data = sumv.sum;
		sumv.sum+= temp1;
		
		replaceWithSumOfLarger(node.left, sumv);
	}
	
	public void printInRange(int lo, int hi){
		
		printInRange(lo, hi, root);
		
	}
	
	private void printInRange(int lo, int hi, Node node){
		if(node == null){
			return;
		}
		if(node.data < lo){
			printInRange(lo, hi, node.right);
		} else if(node.data > hi){
			printInRange(lo, hi, node.left);
		} else{
			System.out.print(node.data+", ");
			printInRange(lo, hi, node.left);
			printInRange(lo, hi, node.right);
		}
		
	}
	

}
