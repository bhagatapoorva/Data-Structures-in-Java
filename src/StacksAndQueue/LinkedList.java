package StacksAndQueue;

public class LinkedList {
	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	private void handlAt0(int item) {

		Node node = new Node();
		node.data = item;
		node.next = null;
		this.head = node;
		this.tail = node;
		this.size = 1;

	}

	public void AddLast(int item) {

		if (this.size == 0) {
			this.handlAt0(item);
		} else {
			Node node = new Node();
			node.data = item;
			node.next = null;
			this.tail.next = node;
			this.tail = node;
			this.size++;
		}

	}

	public void AddFirst(int item) {

		if (this.size == 0) {
			this.handlAt0(item);
		} else {
			Node node = new Node();
			node.data = item;
			node.next = this.head;
			this.head = node;
			this.size++;
		}

	}

	public void addAt(int item, int idx) throws Exception {

		if (idx < 0 || idx > this.size) {
			throw new Exception("Out Of Bound");
		}

		if (idx == 0) {
			this.AddFirst(item);
		} else if (idx == this.size) {
			this.AddLast(item);
		} else {
			Node m1 = getNodeAt(idx - 1);
			Node p1 = m1.next;

			Node node = new Node();
			node.data = item;
			m1.next = node;
			node.next = p1;

			this.size++;
		}

	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void display() {
		System.out.println("---------------------");
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println("." + "\n" + "---------------------");
	}

	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("list is emty");
		}
		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("list is emty");
		}
		return this.tail.data;
	}

	public int getAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("list is empty");
		}

		if (idx < 0 || idx > this.size - 1) {
			throw new Exception("out of bound");
		}

		int cidx = 0;
		Node cnode = this.head;

		while (cidx < idx) {
			cnode = cnode.next;
			cidx++;
		}

		return cnode.data;

	}

	private Node getNodeAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("list is empty");
		}

		if (idx < 0 || idx > this.size - 1) {
			throw new Exception("out of bound");
		}

		int cidx = 0;
		Node cnode = this.head;

		while (cidx < idx) {
			cnode = cnode.next;
			cidx++;
		}

		return cnode;

	}

	private int handleRemove1() {
		int rv = this.head.data;
		this.head = null;
		this.tail = null;
		this.size = 0;
		return rv;
	}

	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("list is emty");
		}

		if (this.size == 1) {
			return handleRemove1();
		} else {
			int rv = this.head.data;
			this.head = this.head.next;
			this.size--;
			return rv;
		}
	}

	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("list is empty");
		}

		if (this.size == 1) {
			return this.handleRemove1();
		} else {
			int rv = this.tail.data;
			this.tail = this.getNodeAt(this.size - 2);
			this.tail.next = null;
			this.size--;
			return rv;
		}
	}

	public int removeAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("list is empty");
		}

		if (idx < 0 || idx > this.size - 1) {
			throw new Exception("Out Of Bound");
		}

		if (idx == 0) {
			return this.removeFirst();
		} else if (idx == this.size - 1) {
			return this.removeLast();
		} else {
			Node m1 = this.getNodeAt(idx - 1);
			Node n = m1.next;
			Node p1 = m1.next.next;

			m1.next = p1;
			this.size--;
			return n.data;
		}
	}

	public void reverseDataIterative() throws Exception {
		int lidx = 0, ridx = this.size - 1;

		while (lidx <= ridx) {
			Node lnode = this.getNodeAt(lidx);
			Node rnode = this.getNodeAt(ridx);

			int temp = lnode.data;
			lnode.data = rnode.data;
			rnode.data = temp;

			lidx++;
			ridx--;
		}
	}

	public void reversePointerIterative() {

		Node previous = this.head;
		Node current = previous.next;

		while (current != null) {
			Node keep = current.next;
			current.next = previous;
			previous = current;
			current = keep;

		}
		Node n = this.head;
		this.head = this.tail;
		this.tail = n;
		this.tail.next = null;

	}

	public void reversePointerRecursive() {

		this.reversPointerRecursive(this.head, this.head.next);
		Node n = this.head;
		this.head = this.tail;
		this.tail = n;
		this.tail.next = null;

	}

	private void reversPointerRecursive(Node previous, Node current) {
		if (current == null) {

			return;
		}
		reversPointerRecursive(current, current.next);
		current.next = previous;
	}

	public void displayReverse() {
		this.displayReverse(this.head);
		System.out.print(".");
	}

	private void displayReverse(Node node) {
		if (node == null) {
			return;
		}
		displayReverse(node.next);
		System.out.print(node.data + ", ");
	}

	private class HeapMover {
		Node node;
	}

	public void reverseDataRecursive() {
		HeapMover left = new HeapMover();
		left.node = this.head;
		this.reverseDataRecursive(left, this.head, 0);

	}

	private void reverseDataRecursive(HeapMover left, Node right, int floor) {
		if (right == null) {
			return;
		}
		reverseDataRecursive(left, right.next, floor + 1);
		if (floor >= this.size / 2) {
			int temp = left.node.data;
			left.node.data = right.data;
			right.data = temp;

			left.node = left.node.next;
		}

	}

	public boolean isPallindrome() {
		HeapMover left = new HeapMover();
		left.node = this.head;
		return isPallindrome(left, this.head);
	}

	private boolean isPallindrome(HeapMover left, Node right) {
		if (right == null) {
			return true;
		}
		boolean check = isPallindrome(left, right.next);
		if (check == false) {
			return false;
		}
		if (right.data != left.node.data) {
			return false;
		}
		left.node = left.node.next;
		return check;
	}

	public void fold() {
		HeapMover left = new HeapMover();
		left.node = this.head;
		fold(left, this.head, 0);
	}

	private void fold(HeapMover left, Node right, int floor) {
		if (right == null) {
			return;
		}
		fold(left, right.next, floor + 1);
		if (floor > this.size / 2) {
			Node keep = left.node.next;
			left.node.next = right;
			right.next = keep;
			left.node = keep;
		}

		if (floor == this.size / 2) {
			this.tail = right;
			right.next = null;
		}

	}

	public int kthFromLast(int k) {
		Node slow = this.head, fast = this.head;

		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}

	public int mid() {
		Node slow = this.head, fast = this.head;

		while (true) {
			if (fast.next == null || fast.next.next == null) {
				break;
			}

			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public Node midNode() {
		Node slow = this.head, fast = this.head;

		while (true) {
			if (fast.next == null || fast.next.next == null) {
				break;
			}

			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public LinkedList mergeSorted(LinkedList other) {
		Node one = this.head, two = other.head;

		LinkedList merged = new LinkedList();

		while (one != null && two != null) {
			if (one.data < two.data) {
				merged.AddLast(one.data);
				one = one.next;
			} else {
				merged.AddLast(two.data);
				two = two.next;
			}
		}

		while (one != null) {
			merged.AddLast(one.data);
			one = one.next;
		}

		while (two != null) {
			merged.AddLast(two.data);
			two = two.next;
		}
		return merged;

	}

	public LinkedList mergeSort() {

		if (this.size == 1) {
			return this;
		}

		Node mid = this.midNode(), midnext = mid.next;
		LinkedList fhalf = new LinkedList();
		LinkedList shalf = new LinkedList();

		fhalf.head = this.head;
		fhalf.tail = mid;
		fhalf.size = (this.size + 1) / 2;
		fhalf.tail.next = null;

		shalf.head = midnext;
		shalf.tail = this.tail;
		shalf.size = this.size / 2;
		shalf.tail.next = null;

		fhalf = fhalf.mergeSort();
		shalf = shalf.mergeSort();

		LinkedList sorted = fhalf.mergeSorted(shalf);
		return sorted;
	}

	public void kReverse(int k) throws Exception {
		LinkedList previous = null;
		LinkedList current = null;

		while (this.size != 0) {
			current = new LinkedList();
			for (int i = 0; i < k; i++) {
				current.AddFirst(this.removeFirst());
			}
			if (previous == null) {
				previous = new LinkedList();
				previous.head = current.head;
				previous.tail = current.tail;

			} else {
				previous.tail.next = current.head;
				previous.tail = current.tail;
			}
			previous.size += current.size;
		}
		this.head = previous.head;
		this.tail = previous.tail;
		this.size = previous.size;

	}

	public void Aq1(int idx1, int idx2) throws Exception {
		Node keep = null;
		if (idx1 == 0) {
			Node one = this.getNodeAt(idx1);
			Node two = this.getNodeAt(idx2 - 1);
			keep = two.next.next;

			if (idx2 == 1) {
				two.next.next = one;
			} else {
				two.next.next = one.next;
			}
			this.head = two.next;
			two.next = one;
			one.next = keep;

			if (idx2 == this.size - 1) {
				this.tail = one;
			}

		} else {
			Node one = this.getNodeAt(idx1 - 1);
			Node two = this.getNodeAt(idx2 - 1);
			Node keep1 = one.next;
			keep = two.next.next;

			one.next = two.next;
			if (idx2 - idx1 == 1) {
				two.next.next = two;
			} else {
				two.next.next = keep1.next;
				two.next = keep1;
			}
			keep1.next = keep;

			if (idx2 == this.size - 1) {
				this.tail = keep1;
			}
		}

	}

	public void Aq2() throws Exception {
		LinkedList newlist = null;

		while (this.size != 0) {
			int rv = this.removeFirst();
			if (newlist == null) {
				newlist = new LinkedList();
				newlist.AddLast(rv);
			} else {
				if (newlist.getLast() != rv) {

					newlist.AddLast(rv);
				}
			}

		}
		this.head = newlist.head;
		this.tail = newlist.tail;
		this.size = newlist.size;
	}

//	public void Aq6a(){
	//	LinkedList 
		//int counter = 1;
		//while(counter<=this.size-1){
			
		//}
		
//	}
	
	public void Aq9() throws Exception {
		LinkedList even = new LinkedList();
		LinkedList odd = new LinkedList();
		while (this.size != 0) {
			int rv = this.removeFirst();
			if (rv % 2 == 0) {
				even.AddLast(rv);
			} else {
				odd.AddLast(rv);
			}
		}

		this.head = odd.head;
		odd.tail.next = even.head;
		this.tail = even.tail;
		this.size = odd.size + even.size;
	}

	public void Aq10(){
		
		this.printReverse(this.head);
	}
	
	private void printReverse(Node store ){
		
		if(store == null){
			return;
		}
		
		printReverse(store.next);
		System.out.print(store.data + ", ");
	}
	
	public void Aq11(int n) {
		Node pre = this.head, current = this.head;
		for (int i = 0; i < n; i++) {
			current = current.next;
		}
		while (current.next != null) {
			pre = pre.next;
			current = current.next;
		}
		this.tail.next = this.head;
		this.head = pre.next;
		pre.next = null;
	}

}
