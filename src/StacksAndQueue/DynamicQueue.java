package StacksAndQueue;

public class DynamicQueue extends queue {
	@Override    // important for spell check
	public void enqueue(int item) throws Exception {
		if (this.size == this.data.length) {
			int[] oa = this.data;
			this.data = new int[2 * oa.length];

			for (int i = 0; i < oa.length; i++) {
				this.data[i] = oa[(this.front + i) % oa.length];
			}
			this.front=0;
		}
	
		super.enqueue(item);
	}
	
	

}
