package home;

/* E
   DE
   CDE
   BCDE
   ABCDE
*/
import java.util.Scanner;

public class pd {

	public static void main(String[] args) {
		
			System.out.println("enter  number");
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
	        int row=1;
	        char ch=(char) (65+n-1);
	        while(row<=n){
	        	int col=1;
	        	char val=ch;
	        	while(col<=row){
	        		System.out.print(val);
	        		val=(char) (val+1);
	        		col+=1;
	        		
	        	}
	        	ch=(char) (ch-1);
	        	System.out.print("\n");
	        	
	        	row+=1;
	        }
	}

}
