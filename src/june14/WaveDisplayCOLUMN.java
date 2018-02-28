package june14;

public class WaveDisplayCOLUMN {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 },
				{ 51, 52, 53, 54 } };
		int row = 0;
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + "\t");

				}
			} else {
				for (row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + "\t");

				}

			}
		}

	}

}
