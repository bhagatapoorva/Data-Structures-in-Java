package TimeComplexity;

public class BoardPathsBetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30;
		System.out.println(bpbnice(0, n, new int[n + 1]));
		System.out.println(bpbetter(0,n));
		System.out.println(bpbest(0,n));
		System.out.println(bpbad(0, n));
		

	}

	public static int bpbnice(int curr, int end, int[] store) {

		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (store[curr] != 0) {
			return store[curr];
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += bpbnice(curr + dice, end, store);

		}
		store[curr] = count;
		return count;
	}

	public static int bpbad(int curr, int end) {

		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}

		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += bpbad(curr + dice, end);

		}

		return count;
	}
	
	public static int bpbetter( int curr,int end){
		int[] store = new int [end+6];
		
		store[end] = 1;
		for(int i = end-1;i>=0;i--){
			for(int j = i+1; j<i+7;j++){
				store[i]+=store[j];
			}
			
		}
		return store[0];     // basically in this method curr not required because the return statement is basically return store[curr}
	}
	
	public static int bpbest(int curr, int end){
		int[] store = new int[6];
		store[0] = 1;
		for(int i =end-1; i>=0; i--){
			int newval = store[0]+ store[1]+store[2]+store[3]+store[4]+store[5];
			store[5]=store[4];
			store[4]=store[3];
			store[3]=store[2];
			store[2]=store[1];
			store[1]=store[0];
			store[0]=newval;
		}
		return store[0]; // return store[curr];
	}

}
