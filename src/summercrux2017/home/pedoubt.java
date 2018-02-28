package home;

import java.util.Scanner;
/*
 *                  0	
				1	0	1	
			2	1	0	1	2	
		3	2	1	0	1	2	3	
	4	3	2	1	0	1	2	3	4	
5	4	3	2	1	0	1	2	3	4	5	

DOUBT: Two while loops to write the numbers. How to doit using one while loop?

 */

public class pedoubt {

	public static void main(String[] args) {
		
			System.out.println("enter  number");
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			int nsp=n-1;
			int row=1;
			while(row<=n){
				int csp=1;
				while(csp<=nsp){
					System.out.print("\t");
					csp+=1;
				}
				int  val=row-1;
				
					while(val!=0){
						System.out.print(val);
						System.out.print("\t");
						val--;
					}
					while(val<=row-1){
						System.out.print(val);
						System.out.print("\t");
						val++;
					}
					
					
				
				nsp-=1;
				row+=1;
				System.out.print("\n");
			}

	}

}
