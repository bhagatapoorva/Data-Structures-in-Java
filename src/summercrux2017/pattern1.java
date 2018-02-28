package summercrux2017;

import java.util.Scanner;

public class pattern1 {

	
	public static void main(String[] args) {
System.out.println("enter the number");
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, val = 1;
		while(row<=n){
			int cst = 1;
			while(cst<=row) {
				System.out.print(val);
				System.out.print("\t");
				val++;
				cst++;
				
				
			}
			System.out.print("\n");
			row +=1;
		}

	}

}
