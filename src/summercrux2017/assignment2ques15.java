package summercrux2017;

import java.util.Scanner;

public class assignment2ques15 {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nsp = 2 * n - 3, nst = 1;
		while (row <= n) {
			int cst = 1, val = 1, c = 0;
			while (cst <= nst) {
				System.out.print(val);
				System.out.print("\t");
				val++;
				
				cst++;
			}

			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
			nsp -= 2;
			nst +=1;
			if(row==n){
			cst = row;
			while (cst >= 1) {
				if (row < n) {
					val -= 1;
					System.out.print(val);
					System.out.print("\t");

				} else {
					while (c >= 1) {
						System.out.print(c);
						c -= 1;
						System.out.print("\t");
					}
				}
				cst -= 1;
			}

			row += 1;
			System.out.print("\n");
		}

		}
	}
}


