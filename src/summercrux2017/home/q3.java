package home;
/*
 * A
   BB
   CCC
   DDDD
   EEEEE

 */
import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		
			System.out.println("enter  number");
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			int row = 1;
			char ch = 65;
			while(row<=n){
				int col=1;
				while(col<=row){
				System.out.print(ch);
				col+=1;
				}
				System.out.print("\n");
				ch=(char) ((char)ch+1);
				row+=1;
				
			}
			

	}

}
