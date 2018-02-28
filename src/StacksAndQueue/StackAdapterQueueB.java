package StacksAndQueue;

public class StackAdapterQueueB {

	stack sp = new Dynamicstack();
	stack shelp = null;

	public void enqueue(int item) throws Exception {
		stack shelp = new Dynamicstack();
		this.sp.push(item);
		this.enqueue();
	}
	
	private void enqueue() throws Exception{
		if(this.sp.size() == 0){
			return;
		}
		
		int rv = this.sp.pop();
		this.shelp.push(rv);
		enqueue();
		this.sp.push(rv);
		
	}

	public int dequeue() throws Exception {
		return this.shelp.pop();
	}

	public void display() {
		this.shelp.display();
	}

}
