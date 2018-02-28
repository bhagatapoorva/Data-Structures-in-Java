package TimeComplexity;

public class FibonacciBetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n = 45;
		System.out.println(fgood(n,new int[n+1]));
		System.out.println(fbetter(n));
		System.out.println(fbest(n));
		

	}
	public static int fgood(int n, int[] store){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		if(store[n]!=0){
			return store[n];
		}
		
		int fibnm1 = fgood(n-1, store);
		int fibnm2 = fgood(n-2, store);
		int fibn = fibnm1+fibnm2;
		store[n]=fibn;
		return fibn;
	}
	
	public static int fbetter(int n){
		int[] store = new int[n+1];
		store[0]=0;
		store[1]=1;
		for(int i = 2;i<store.length;i++){
			store[i] = store[i-1]+store[i-2];
		}
		return store[n];
	}
	
	public static int fbest(int n){
		int[] store = new int[2];
		store[0]=0;
		store[1]=1;
		
		for(int i = 1; i<n ; i++){
			int fibnew = store[0]+store[1];
			store[0]=store[1];
			store[1]=fibnew;
		}
		return store[1];
	}

}
