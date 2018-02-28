package june14;

import java.util.Scanner;

public class A4Q20 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
       int counter = m*n;
		int rowmin = 0, rowmax = arr.length - 1, colmin = 0, colmax = arr[0].length - 1, dir = 0, count = 1;
		while (count <= counter) {
			int row = rowmin, col = colmin;
			if (dir % 4 == 0) {
				while (col < colmax&&count<=counter) {
					System.out.print(arr[row][col] + ",\t");
					col++;
					count++;
				}
				dir++;
			}

			if (dir % 4 == 1) {
				while (row < rowmax&&count<=counter) {
					System.out.print(arr[row][col] + ",\t");
					row++;
					count++;
				}
				dir++;
			}
			if (dir % 4 == 2) {
				while (col > colmin&&count<=counter) {
					System.out.print(arr[row][col] + ",\t");
					count++;
					col--;
				}
				dir++;
			}
			if (dir % 4 == 3) {
				while (row > rowmin&&count<=counter) {
					System.out.print(arr[row][col] + ",\t");
					count++;
					row--;
				}
				dir++;
			}
			rowmax--;
			colmax--;
			rowmin++;
			colmin++;

		}
		System.out.print("END");
	}

}
