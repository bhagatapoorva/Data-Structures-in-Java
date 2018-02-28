package RecursionAssignment6;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		pascal(0, 0, 1, n);
	}

	public static void pascal(int row, int col, int val, int n) {
		if (row == n) {
			return;
		}
		if (col > row) {
			System.out.println();
			pascal(row + 1, 0, 1, n);
			return;
		}
		System.out.print(val+"\t");

		val = (val * (row - col)) / (col + 1);

		pascal(row, col + 1, val, n);

	}

}
