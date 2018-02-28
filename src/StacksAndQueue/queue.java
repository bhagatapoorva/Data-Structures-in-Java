package StacksAndQueue;

public class queue {
	protected int[] data;
	protected int front;
	protected int size;

	public queue() {
		this(5);
	}

	public queue(int cap) {
		data = new int[cap];
	}

	public void enqueue(int item) throws Exception {
		if (this.size == data.length) {
			throw new Exception("queue is full");
		}

		int tail = (this.front + this.size) % data.length;
		this.data[tail] = item;
		this.size++;
	}

	public int dequeue() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");
		}
		int val = this.data[this.front];
		this.data[this.front] = 0;
		this.front = (this.front + 1) % data.length;
		this.size--;
		return val;
	}

	public int front() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");
		}
		return this.data[this.front];

	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		if (this.size == 0) { // return this.size==0
			return true;
		} else {
			return false;
		}
	}

	public void display() {

		System.out.println("-------------------------");
		for (int i = 0; i < size; i++) {
			System.out.print(this.data[(this.front + i) % data.length] + ", ");
		}
		System.out.println(".");
		System.out.println("-------------------------");

	}
	
	public void queueReverseUsingRecursion(){
		boolean[] check = new boolean[this.data.length];
		this.queueReverseUsinRecursion(this.front, ((this.front+this.size-1)%this.data.length), check);
	}

	private void queueReverseUsinRecursion(int front, int rear, boolean[] check) {
		if(check[front] == true || check[rear] == true){
			return;
		}

//		System.out.println(front +" " + rear);
		
		int rev = this.data[front];
		this.data[front] = this.data[rear];
		this.data[rear] = rev;
		check[front] = true; check [rear] = true;
		
		if(rear == 0){
			rear = this.data.length-1;
		} else{
			rear = rear-1;
		}
		
		this.queueReverseUsinRecursion( (front+1)%this.data.length, rear, check);
		
	}

}
