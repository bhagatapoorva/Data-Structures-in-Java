package RecursionAssignment6;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		reversetriangle(1, 1, n);

	}

	public static void reversetriangle(int row, int col, int n) {
		if (row > n) {
			return;
		}
		if (col > row) {
			reversetriangle(row + 1, 1, n);
			if (row != n) {
				System.out.println();
			}
			return;
		}
		reversetriangle(row, col + 1, n);
		System.out.print("*" + "\t");
	}

}
