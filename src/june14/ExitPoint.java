package june14;

public class ExitPoint {

	public static void main(String[] args) {
		int[][] arr={ { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 },
				{ 1, 0, 1, 0 } };
		int row=0,col=0;
		while(row!= arr.length||col!=arr[0].length){
			while(row!=arr.length){
				if(arr[row][col]==0){
					col+=1;
				} else{
					row+=1;
					break;
				}
				
			}
			while(col!=arr[0].length){
				
			}
			
			
			
		}

	}

}
