package june14;

import java.util.Scanner;

public class A4Q17 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int m = scn.nextInt();
		int n = scn.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scn.nextInt();
				System.out.print("\t");

			}
			System.out.print("\n");
		}

			for (int row = 0; row < arr.length; row++) {
				if (row % 2 == 0) {
					for (int col = 0; col < arr[0].length; col++) {
						System.out.print(arr[row][col] + "\t");
					}

				} else {
					for (int col = arr[0].length - 1; col >= 0; col--) {
						System.out.print(arr[row][col] + "\t");
					}
				}
			}

		}

	}

