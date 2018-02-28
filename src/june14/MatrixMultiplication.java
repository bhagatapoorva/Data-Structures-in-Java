package june14;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] arr1 = {{1,2,3},{2,3,5},{3,4,5}};
		int[][] arr2 = {{1,2},{3,4},{2,1}};
		int row1=arr1.length;
		int col1=arr1[0].length;
		int row2=arr2.length;
		int col2=arr2[0].length;
		if(row2==col1){
			int[][] mul= new int[row1][col2];
			for(row1=0;row1<arr1.length;row1++){
				for(col2=0;col2<arr2[0].length;col2++){
					int sum=0;
					col1=0;
					row2=0;
					while(col1<arr1[0].length){
					sum+=(arr1[row1][col1]*arr2[row2][col2]);
					col1++;
					row2++;
					}
					mul[row1][col2]=sum;
					System.out.print(mul[row1][col2]+" ");
				}
				System.out.println();
			}
			
			
		}
		
		

	}

}
