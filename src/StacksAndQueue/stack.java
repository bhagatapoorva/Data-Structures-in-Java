package StacksAndQueue;

public class stack {

	protected int[] data;
	protected int tos = -1;

	stack() {
		this(9);
	}

	stack(int cap) {
		data = new int[cap];
	}

	public void push(int item) throws Exception {
		if (this.tos == this.data.length - 1) {
			throw new Exception("stack is full");
		}
		this.tos++;
		this.data[this.tos] = item;
	}

	public int top() throws Exception {
		if (this.tos == -1) {
			throw new Exception("stack is empty");
		}

		return this.data[this.tos];

	}

	public int pop() throws Exception {
		if (this.tos == -1) {
			throw new Exception("stack is empty");
		}
		int rv = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;
		return rv;
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean IsEmpty() {
		if (this.tos == -1) { // or just return this.tos==-1;
			return true;
		} else {
			return false;
		}
	}

	public void display() {
		for (int i = this.tos; i >= 0; i--) {
			System.out.print("," + this.data[i]);
		}
		System.out.println();
	}
	
	public int getMin() throws Exception{
		return 0;
	}
	

}
