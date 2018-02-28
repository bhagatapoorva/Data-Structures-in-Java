package june14;

import java.util.Scanner;

public class ShellRotate {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		Scanner scn = new Scanner(System.in);
		System.out.println("enter k");
		int k = scn.nextInt();
		System.out.println("enter r");
		int r = scn.nextInt();
		System.out.println();
		sr(arr, k, r);

	}

	public static void sr(int[][] arr, int k, int r) {
		int rowmax = arr.length - 1, colmax = arr[0].length - 1, rowmin = 0, colmin = 0;
		System.out.println(rowmin + " " + colmin + " " + rowmax + " " + colmax);
		if (k != 1) {

			rowmin += k - 1;
			rowmax -= k - 1;
			colmin += k - 1;
			colmax -= k - 1;

		}
		while (r > 0) {
			int row = rowmin, col = colmin,dir=0;
			System.out.println(r);
			System.out.println(row + " " + col + " " + rowmax + " " + colmax);
			int temp = arr[row][col];
			System.out.println(temp);
			while (true) {
				if (dir == 0) {

					arr[row][col] = arr[row][col + 1];
					System.out.println(arr[row][col]);
					col++;
					if (col == colmax) {
						dir++;
					}

				} else if (dir == 1) {
					arr[row][col] = arr[row + 1][col];
					System.out.println(arr[row][col]);
					row++;
					if (row == rowmax) {
						dir++;
					}
				} else if (dir == 2) {
					arr[row][col] = arr[row][col - 1];
					System.out.println(arr[row][col]);
					col--;
					if (col == colmin) {
						dir++;
					}
				} else {
					arr[row][col] = arr[row - 1][col];
					System.out.println(arr[row][col]);
					row--;
					if (row == rowmin + 1) {
						arr[row][col] = temp;
						System.out.println(arr[row][col]);
						break;
					}
				}
			}
			r--;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
