package assignments;

public class Stack {

	private char[] data;
	private int tos = -1;
	
	Stack(){
	 this(5);	
	}

	public Stack(int cap) {
		data = new int[cap];
	}
	
	public void push(char item) throws Exception{
		if(this.tos == this.data.length-1){
			throw new Exception("stack is full");
		}
		this.tos++;
		this.data[this.tos] = item;
	
	}
	
	public void pop() throws Exception{
		if(this.tos==-1){
			throw new Exception("stack is empty");
		}
		this.data[this.tos]=0;
		this.tos--;
		
	}
}
