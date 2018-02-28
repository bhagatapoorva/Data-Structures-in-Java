package summercrux2017;

import java.util.Scanner;

public class hollowdiamond {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=0, nsp=n,nst=n;
		while(row<n){
			int csp=1,cst=1;
			while(cst<=nst){
				System.out.print("*"+ "\t");
				cst++;
			}
			while(csp<=nsp){
				System.out.print("\t");
				csp++;
			}
			
			
			System.out.println();
			row++;
		}

	}

}
