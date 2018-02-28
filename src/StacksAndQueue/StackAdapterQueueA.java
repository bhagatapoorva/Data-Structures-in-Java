package StacksAndQueue;

public class StackAdapterQueueA  {
      stack sp = new Dynamicstack();
      stack shelp = new Dynamicstack();
      
	
	public void enqueue(int item) throws Exception{
		this.sp.push(item);
	}
	
	public int dequeue() throws Exception{
		return this.dequeuee();
	}
	
	private int dequeuee()throws Exception {
		if(this.sp.tos == 0){
			int rv = this.sp.pop();
			return rv;
		}
		
		int rv = this.sp.pop();
		int res = this.dequeuee();
		this.sp.push(rv);
		return res;
		
	}
	
	public int front() throws Exception{
		if(this.sp.tos == -1){
			return 0;
		}
		
		int rv = this.sp.pop();
		this.shelp.push(rv);
		int res = front();
		this.sp.push(rv);
		return this.shelp.top();
	}
	
	public void display() throws Exception{
		if(this.sp.tos == -1){
			return;
		}
		int rv = this.sp.pop();
		display();
		System.out.print(rv+", ");
		this.sp.push(rv);
	}
	
	public int size(){
		return this.sp.size();
	}
	
	public boolean isEmpty(){
		return this.sp.IsEmpty();
	}
	
	
	
}


