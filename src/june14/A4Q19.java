package june14;

public class A4Q19 {
	public static void main(String[] args) {
		int[][] arr = { { 1,2,3}, { 4,5,6 }, { 7,8,9 }, { 10,11,12 },{13,14,15} };
		int count = arr.length*arr[0].length;
		
		int counter = 0, rowmin = 0, rowmax = arr.length - 1, colmin = 0, colmax = arr[0].length - 1, dir = 0, r = 0,
				c = 0;
		while (counter < count) {

			if (dir % 4 == 0) {
				for (r = rowmin; r < rowmax; r++) {
					if (counter < count) {
						System.out.print(arr[r][c] + " ");
						counter += 1;
					}
				}
				dir+=1;

			}
			if (dir % 4 == 1) {
				for (c = colmin; c < colmax; c++) {
					if (counter < count) {
						System.out.print(arr[r][c] + " ");
						counter += 1;
					}
				}
				
				dir+=1;
			}
			if (dir % 4 == 2) {
				for (r = rowmax; r > rowmin; r--) {
					if (counter < count) {
						System.out.print(arr[r][c] + " ");
						counter += 1;
					}
				}
				dir+=1;
			}
			if (dir % 4 == 3) {
				for (c = colmax; c > colmin; c--) {
					if (counter < count) {
						System.out.print(arr[r][c] + " ");
						counter += 1;
					}
				}
				dir+=1;
			}
			c+=1;
			
			
			rowmin += 1;
			rowmax -= 1;
			colmin += 1;
			colmax -= 1;

		}

	}
}
