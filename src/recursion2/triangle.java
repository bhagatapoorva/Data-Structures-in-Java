package recursion2;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTriangle(1,1,5);


	}
	
	public static void printTriangle(int row, int col, int n){
		if(row > n){
			return;
		}
		
		if(col <= row){
			System.out.print("* ");
			printTriangle(row, col+1, n);
			return;
		}
		
		System.out.println();
		printTriangle(row+1, 1, n);
	}

}
