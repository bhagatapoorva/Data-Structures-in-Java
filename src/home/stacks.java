package home;

public class stacks {
	
	protected int[] data;
	protected int tos;
	
	stacks(){
		this(5);
	}
	
	stacks(int cap){
		data = new int[cap];
	}  
	
	public void push(int item) throws Exception{
		if(this.tos == this.data.length-1){
			throw new Exception("STACK OVERFLOW");
		}
		this.tos++;
		this.data[this.tos] = item;
	}
	
	public int top() throws Exception{
		if(this.tos == -1){
			throw new Exception("SRACK UNDERFLOW");
		}
		return this.data[this.tos];
		
	}
	
	public int pop() throws Exception{
		if(this.tos == -1){
			throw new Exception("STACK UNDERFLOW");
		}
		int rv = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;
		return rv;
		
	}
	
	public boolean isEmpty(){
		return this.tos==-1;
	}
	
	public void display() throws Exception{
		if(this.tos == -1){
			System.out.println("STACK IS EMPTY");
		}
		
		for(int i = tos; i >= 0 ;i--){
			System.out.print(this.data[i] + " ");
		}
	}

}
