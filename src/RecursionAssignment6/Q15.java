package RecursionAssignment6;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		selectionsort(arr, 0, 1);

	}

	public static void selectionsort(int[] arr, int vidx1, int vidx2) {
		if (vidx1 == arr.length) {
			return;
		}
		if (vidx2 == arr.length) {
			if (vidx1 == 0 || arr[vidx1] != arr[vidx1 - 1]) {
				System.out.println(arr[vidx1]);
			}
			selectionsort(arr, vidx1 + 1, vidx1 + 2);
			return;
		}
		if (arr[vidx1] > arr[vidx2]) {
			int temp = arr[vidx1];
			arr[vidx1] = arr[vidx2];
			arr[vidx2] = temp;

		}
		selectionsort(arr, vidx1, vidx2 + 1);
	}

}
