package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

import javax.xml.soap.Node;

public class GenericTree {

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;
	private int size;

	public GenericTree() { // constructor
		Scanner scn = new Scanner(System.in);
		this.root = takeInput(null, -1, scn);
	}

	private Node takeInput(Node parent, int childIdx, Scanner scn) {
		// prompt

		if (parent == null) {
			System.out.println("Enter root data");
		} else {
			System.out.println("Enter data for" + childIdx + " th child of" + parent.data);
		}

		// enter data
		int data = scn.nextInt();

		// create node, set data and maintain size
		Node child = new Node();
		child.data = data;
		this.size++;

		// ask number of grand children
		System.out.println(" Enter number of children for " + child.data);
		int numgc = scn.nextInt();

		// create and attach grand children
		for (int i = 0; i < numgc; i++) {
			Node grandChild = takeInput(child, i, scn);
			child.children.add(grandChild); // important
		}

		// return
		return child;

	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		if (this.size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		// display
		String str = node.data + " => ";
		for (Node child : node.children) {
			str += child.data + ", ";
		}
		System.out.println(str + ".");

		// delegate
		for (Node child : node.children) {
			display(child);
		}
	}

	public int size2() {
		return size2(root);
	}

	private int size2(Node node) {
		int sz = 0;

		for (Node child : node.children) {
			int cs = size2(child);
			sz += cs;
		}
		sz += 1; // +1 for the node itself
		return sz;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		int store = node.data;

		for (Node child : node.children) {
			int rval = max(child);
			if (rval > store) {
				store = rval;
			}
		}
		return store;
	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {
		int h = -1;

		for (Node child : node.children) {
			int depth = height(child);
			if (depth > h) {
				h = depth;
			}
		}

		return h + 1;
	}

	public boolean find(int data) {
		return find(root, data);
	}

	private boolean find(Node node, int data) {
		if (node.data == data) {
			return true;
		}
		for (Node child : node.children) {
			boolean res = find(child, data);

			if (res == true) {
				return true;
			}
		}
		return false;

	}

	public void mirror() {
		mirror(root);
	}

	private void mirror(Node node) {

		for (Node child : node.children) {
			mirror(child);
		}

		int lo = 0, high = node.children.size() - 1;
		while (lo <= high) {
			Node left = node.children.get(lo);
			Node right = node.children.get(high);

			node.children.set(lo, right);
			node.children.set(high, left);
			lo++;
			high--;
		}
	}

	public void printAtDeapth(int d) {
		printAtDeapth(root, d);
		System.out.print(".");
	}

	private void printAtDeapth(Node node, int d) { // check
		if (d == 0) {
			System.out.print(node.data + ", ");
			return;
		}
		int c = d - 1;
		for (Node child : node.children) {
			printAtDeapth(child, c);
		}
	}

	public void preOrder() {
		preOrder(root);
		System.out.println(".");
	}

	private void preOrder(Node node) {
		System.out.println(node.data + ", ");
		for (Node child : node.children) {
			preOrder(child);
		}
	}

	public void postOrder() {
		postOrder(root);
		System.out.println();
	}

	private void postOrder(Node node) {
		for (Node child : node.children) {
			postOrder(child);
		}
		System.out.println(node.data + ", ");
	}

	public void levelOrder() {
		LinkedList<Node> q = new LinkedList<>();
		q.addLast(root);

		while (q.size() != 0) {
			Node res = q.removeFirst();
			System.out.print(res.data + ", ");
			q.addAll(res.children);
			// for(Node child : res.children){
			// q.addLast(child);
			// }
		}

	}

	public void levelOrderLineWise() {
		LinkedList<Node> thislevel = new LinkedList<>();
		LinkedList<Node> nextlevel = new LinkedList<>();

		thislevel.addLast(root);

		while (thislevel.size() != 0) {
			Node res = thislevel.removeFirst();
			System.out.print(res.data + ", ");
			nextlevel.addAll(res.children);

			if (thislevel.size() == 0) {
				System.out.println();
				thislevel = nextlevel;
				nextlevel = new LinkedList<>();
			}
		}
	}

	private class HeapMover {
		private int size;
		private int height;
		private boolean found;
		private Node previous, pred, succ;

		private Node justLarger;
		private int max = Integer.MIN_VALUE;
		private int min = Integer.MAX_VALUE;
	}

	public void multiSolver(int data) {
		HeapMover bucket = new HeapMover();
		multiSolver(root, bucket, data, 0);

		System.out.println("size is " + bucket.size);
		System.out.println("height is " + bucket.height);
		System.out.println("max is " + bucket.max);
		System.out.println("min is " + bucket.min);
		System.out.println("found is " + bucket.found);

		if (bucket.pred == null) {
			System.out.println("pred not found");
		} else {
			System.out.println("predessor is " + bucket.pred.data);
		}
		if (bucket.succ == null) {
			System.out.println("Succ not found");
		} else {
			System.out.println("successor is " + bucket.succ.data);
		}
		if (bucket.justLarger == null) {
			System.out.println("Just larger not found");
		} else {
			System.out.println("just larger is " + bucket.justLarger);
		}
	}

	private void multiSolver(Node node, HeapMover bucket, int data, int depth) {

		bucket.size++;

		if (bucket.found == true) { // successor
			if (bucket.succ == null) {
				bucket.succ = node;
			}
		}

		if (data == node.data) {
			bucket.found = true;

		}

		if (depth > bucket.height) {
			bucket.height = depth;
		}

		if (node.data > bucket.max) {
			bucket.max = node.data;
		}

		if (node.data < bucket.min) {
			bucket.min = node.data;
		}

		if (node.data > data) {
			if (bucket.justLarger == null) {
				bucket.justLarger = node;
			} else {
				if (node.data < bucket.justLarger.data) {
					bucket.justLarger = node;
				}
			}
		}
		if (node.data == data) {
			bucket.pred = bucket.previous;
		}

		bucket.previous = node;

		for (Node child : node.children) {
			multiSolver(child, bucket, data, depth + 1);
		}
	}

	public int kthSmallest(int k) {
		Integer kthsmallest = Integer.MIN_VALUE;
		for (int i = 0; i < k; i++) {
			HeapMover bucket = new HeapMover(); // if heapmover not made new
												// after every iteration, then
												// answer will be the smallest
												// because the null condition
												// wont be checked again
			kthSmallest(bucket, root, kthsmallest);
			kthsmallest = bucket.justLarger.data;
		}
		return kthsmallest;

	}

	private void kthSmallest(HeapMover bucket, Node node, int data) {
		if (node.data > data) {
			if (bucket.justLarger == null) {
				bucket.justLarger = node;
			} else {
				if (node.data < bucket.justLarger.data) {
					bucket.justLarger = node;
				}
			}
		}

		for (Node child : node.children) {
			kthSmallest(bucket, child, data);
		}

	}

	public int kthSmallestB(int k) {
		ArrayList<Integer> store = new ArrayList<>();
		kthSmallestB(root, store);
		Collections.sort(store);
		return store.get(k - 1);

	}

	private void kthSmallestB(Node node, ArrayList<Integer> store) {
		store.add(node.data);
		for (Node child : node.children) {
			kthSmallestB(child, store);
		}
	}

	public void removeLeaves() {
		removeLeaves(root);
	}

	private void removeLeaves(Node node) {

		for (int i = node.children.size() - 1; i >= 0; i--) { // why not
																// i=0;i<size
																// reason is
																// that after
																// every removal
																// size gets
																// reduced
			Node child = node.children.get(i); // but with i = size-1; i>=0,
												// even if size changes after
												// removal, index does
			if (child.children.size() == 0) { // not and loop goes on for
												// desired number of times
				node.children.remove(i);
			}
		}
		for (Node child : node.children) {
			removeLeaves(child);
		}
	}

	public void linearize() {
		linearize(root);
	}

	private void linearize(Node node) {
		for (int i = node.children.size() - 1; i > 0; i--) {
			Node previous = node.children.get(i - 1);
			Node current = node.children.get(i);

			node.children.remove(i);
			previous.children.add(current);
		}
		for (Node child : node.children) {
			linearize(child);
		}
	}

	public void levelOrderZigzag() {
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();

		s1.push(root);

		while (s1.size() == 0 || s2.size() == 0) {

			while (s1.size() != 0) {
				Node temp = s1.pop();
				System.out.print(temp.data + ", ");
				for (int i = 0; i < temp.children.size(); i++) {
					s2.push(temp.children.get(i));
				}
			}

			System.out.println();
			while (s2.size() != 0) {
				Node temp = s2.pop();
				System.out.print(temp.data + ", ");
				for (int i = temp.children.size() - 1; i >= 0; i--) {
					s1.push(temp.children.get(i));
				}
			}
			System.out.println();

			if (s1.size() == 0 && s2.size() == 0) {
				break;
			}
		}
	}

	public boolean isIso(GenericTree g) {
		if (this.size != g.size) {
			return false;
		} else {
			return isIso(this.root, g.root);
		}
	}

	private boolean isIso(Node node, Node g) {

		if (node.children.size() != g.children.size()) {
			return false;
		} else {
			for (int i = 0; i < node.children.size(); i++) {
				Node nodeChild = node.children.get(i);
				Node gChild = node.children.get(i);

				return isIso(nodeChild, gChild);
			}

			return true;
		}
	}
	


	
	
}
