package TimeComplexity;

import java.util.Arrays;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16;
//		System.out.println(mp(0, 0, n, n, new int[n + 1][n + 1]));
//		System.out.println(mpbetter(n, n));
//		System.out.println(mpbest(n,n));
//		System.out.println(mpbad(0, 0, n, n));
		System.out.println(mpwdbetter(3,3));
		System.out.println(mpwdbest(3,3));
		

	}

	public static int mp(int cr, int cc, int er, int ec, int[][] store) {
		if (cc == ec && cr == er) {
			return 1;
		}
		if (cc > ec || cr > er) {
			return 0;
		}
		if (store[cr][cc] != 0) {
			return store[cr][cc];
		}

		int ch = mp(cr, cc + 1, er, ec, store);
		int cv = mp(cr + 1, cc, er, ec, store);
		int count = ch + cv;

		store[cr][cc] = count;
		return count;
	}

	public static int mpbad(int cr, int cc, int er, int ec) {
		if (cc == ec && cr == er) {
			return 1;
		}
		if (cc > ec || cr > er) {
			return 0;
		}

		int ch = mpbad(cr, cc + 1, er, ec);
		int cv = mpbad(cr + 1, cc, er, ec);
		int count = ch + cv;

		return count;
	}

	public static int mpbetter(int er, int ec) {
		int[][] store = new int[er + 2][ec + 2];

		store[er][ec] = 1;
		for (int i = er; i >= 0; i--) {
			for (int j = ec; j >= 0; j--) {
				if (i == er && j == ec) {

				} else {
					store[i][j] = store[i + 1][j] + store[i][j + 1];
				}

			}
		}
		return store[0][0];

	}
	
	public static int mpbest(int er, int ec){
		int[] store = new int[ec+1];
		
		for(int i = 0;i<store.length;i++){
			store[i]=1;
		} 
		
		for(int i = 1; i <= er; i++){
			
			store[ec] = 1;
			for(int j = ec-1; j>= 0;j--){
				store[j] = store[j]  + store[j+1];
			}
		}
		
		return store[0];
	}
	
	public static int mpwdbetter(int er, int ec){
		
		int[][] store = new int[er+2][ec+2];
		store[er][ec] = 1;
		
		for(int row = er; row>=0; row-- ){
			for(int col = ec;col>= 0; col--){
				if(row==er && col==ec){
					
				} else{
					store[row][col] = store[row+1][col+1] + store[row][col+1] + store[row+1][col];
				}
			}
		}
		return store[0][0];
	}
	
	public static int mpwdbest(int er, int ec){
		
		int[] window = new int[ec+1];
		Arrays.fill(window, 1);
		
		for(int i = er-1; i >= 0; i--){
			int ov = 1;
			for(int j = ec -1; j>=0 ; j-- ){
				int nv = window[j] + window[j+1] + ov;
			    ov = window[j];
				window[j] = nv;	
			}
		}
		return window[0];
	}
	
	

}
