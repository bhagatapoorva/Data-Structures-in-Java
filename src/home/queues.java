package home;

public class queues {
	protected int[] data;
	protected int front;
	protected int size;

	queues() {
		this(5);
	}

	queues(int cap) {
		data = new int[cap];
	}

	public void enqueue(int item) throws Exception {
		if (this.size == this.data.length) {
			throw new Exception("QUEUE IS FULL");
		}

		int rear = (this.front + this.size) % this.data.length;
		this.data[rear] = item;
		this.size++;

	}

	public int deueue() throws Exception {
		if (this.size == 0) {
			throw new Exception("QUEUE IS EMPTY");
		}
		int rv = this.data[this.front];
		this.data[this.front] = 0;
		this.front = (this.front + 1) % this.data.length;
		this.size--;
		return rv;

	}

	public int size() {
		return this.size;
	}

	public int front() throws Exception {
		if (this.size == 0) {
			throw new Exception("QUEUE IS EMPTY");
		}

		return this.data[this.front];
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void display() {
		for (int i = 0; i < this.size; i++) {
			System.out.print(this.data[(this.front + i) % this.data.length] + ", ");
		}
	}

	public void queueReverseUsingRecursion(){
		this.queueReverseUsinRecursion(this.front, ((this.front+this.size-1)%this.data.length));
	}

	private void queueReverseUsinRecursion(int front, int rear) {
		if(front >= rear){
			return;
		}

		int rev = this.data[front];
		this.data[front] = this.data[rear];
		this.data[rear] = rev;
		
		if(rear == 0){
			rear = this.data.length-1;
		} else{
			rear = rear-1;
		}
		
		this.queueReverseUsinRecursion( (front+1)%this.data.length, rear);
		
	}

}
