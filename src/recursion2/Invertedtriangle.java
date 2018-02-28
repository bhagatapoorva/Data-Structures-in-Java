package recursion2;

public class Invertedtriangle {

	public static void main(String[] args) {
		printtiangle(1,1,5);

	}
	public static void printtiangle(int row,int col,int n){
		if(row>n){
			return;
		}
		if(col>row){
			printtiangle(row+1,1,n);
			
			System.out.println();
			return;
			
		}
		
		printtiangle(row,col+1,n);
		System.out.print("*");
		
	}

}
