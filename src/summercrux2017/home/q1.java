package home;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		System.out.println("enter  number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, nst = 1;
		while (row <= 2 * n - 1) {
			int val = 1;
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				System.out.print("\t");
				val += 1;
				cst += 1;
			}
			if (row < n) {
				nst += 1;

			} else {
				nst -= 1;
			}
			row +=1;
			System.out.print("\n");

		}

	}

}
