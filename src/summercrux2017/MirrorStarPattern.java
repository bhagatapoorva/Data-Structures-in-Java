package summercrux2017;

import java.util.Scanner;

public class MirrorStarPattern {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1, nsp = n / 2, row = 1;
		while (row <= n) {
			int csp = 1, cst = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;

			}
			while(cst<=nst){
				System.out.print("*"+"\t");
				cst++;
			}
			if(row<=n/2){
				nst+=2;
				nsp-=1;
				
			}
			else{
				nst-=2;
				nsp+=1;
				
			}
			row++;
			System.out.println();
		}

	}

}
