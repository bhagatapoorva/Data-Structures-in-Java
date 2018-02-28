package home;
/* 11111
   oooo
   111
   oo
   1
*/
import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		
			System.out.println("enter  number");
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			int row=1, nst=n;
			while(row<=n){
				int cst=1;
				while(cst<=nst){
					if(row%2==0){
						System.out.print("o");
					}
					else{
						System.out.print("1");
					}
					cst+=1;
				}
				nst-=1;
				row+=1;
				System.out.print("\n");
			}
	}

}
