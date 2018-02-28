package StacksAndQueue;

public class MinStack extends stack{
	
	stack min = new stack();
	
	@Override
	public void push(int item) throws Exception {
		
		super.push(item);
		
		if(min.tos == -1){
			min.push(item);
		} else if(item <= min.top()){ // = sign important otherwise repeated minimum case not handled.
			min.push(item);
		}
//		min.display();
	}
	
	@Override
	public int pop() throws Exception{
		
		int rv = super.pop();
		
		if(rv == min.top()){
			rv = min.pop();
		}
		
		return rv;
		
	}
	@Override
	public int getMin() throws Exception{
		if(min.tos == 0){
			throw new Exception("STACK IS EMPTY");
		}
		return min.top();
	}
	
	

}
