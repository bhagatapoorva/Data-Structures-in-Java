package home;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAssignment {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(OptimizeFind(8));
		// int[] arr = { 3, 2, 1, 4, 0 };
		// int[] arr2 = { 0, 4, 3, 2, 1 };
		int[] arr = { 1, 1, 1, 1 };
		int[] arr2 = { 2, 3, 2, 3, 2 };
		int[] arrq15 = { 1, 2, 3 };
		int[][] arrq17 = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for(int j =0 ; j< 4; j++){
				arrq17[i][j] = scn.nextInt();
			}
		}
		
		

		// int[] a = reverseArray(arr);
		// int[] a = inverseArray(arr);
		// int[] a = sumOfArray(arr, arr2);
		// System.out.println(isMirrorInverse(arr));
		// System.out.println(checkInverse(arr, arr2));
		// for (int i = 0; i < a.length; i++) {
		// System.out.print(a[i] + " ");
		// }

//		subsets(arrq15);
		wavePrint(arrq17, 4, 4);
		columnPrint(arrq17, 4, 4);

	}

	public static int OptimizeFind(int find) {
		System.out.println("Enter size");
		int n = scn.nextInt();
		int arr[] = new int[n];
		System.out.println("enter n inputs");
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(n);
		int j = 0, k = n - 1, mid = (j + k) / 2, index = -1;

		while (mid >= j && mid <= k) {
			if (arr[mid] == find) {
				index = mid;
				break;
			} else if (find < arr[mid]) {
				k = mid;
			} else {
				j = mid;
			}

			mid = (j + k) / 2;

		}
		return index;
	}

	public static int[] reverseArray(int[] arr) {

		int front = 0, end = arr.length - 1;
		while (front <= end) {
			int temp = arr[front];
			arr[front] = arr[end];
			arr[end] = temp;

			front++;
			end--;
		}

		return arr;

	}

	public static int[] inverseArray(int[] arr) {
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			arr2[temp] = i;
		}

		return arr2;
	}

	public static boolean isMirrorInverse(int[] arr) {
		int[] a = inverseArray(arr);
		for (int i = 0; i < arr.length; i++) {
			if (a[i] != arr[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkInverse(int[] arr1, int[] arr2) {

		for (int i = 0; i < arr1.length; i++) {
			int temp = arr1[i];
			if (arr2[temp] != i) {
				return false;
			}
		}

		return true;

	}

	public static int[] sumOfArray(int[] arr1, int[] arr2) {
		int i = arr1.length - 1, j = arr2.length - 1, c = 0;
		if (i > j) {
			c = i + 1;
		} else {
			c = j + 1;
		}
		int count = c + 1;
		int[] arr3 = new int[count];

		int carry = 0;

		while (i >= 0 && j >= 0) {
			arr3[c] = (carry + (arr1[i] + arr2[j])) % 10;
			carry = (carry + arr1[i] + arr2[j]) / 10;
			i--;
			j--;
			c--;
		}

		while (i >= 0) {
			arr3[c] = (arr1[i] + carry) % 10;
			carry = (carry + arr1[i]) / 10;
			c--;
			i--;
		}

		while (j >= 0) {
			arr3[c] = (arr2[j] + carry) % 10;
			carry = (carry + arr2[j]) / 10;
			c--;
			j--;
		}

		arr3[c] = carry;
		return arr3;

	}

	public static void subsets(int[] arr) {
		System.out.println(" " + ", ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + ", ");

			for (int j = i + 1; j < arr.length; j++) {
				System.out.println(arr[i] + " " + arr[j]);

				for (int k = j + 1; k < arr.length; k++) {
					System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
				}
			}

		}
	}

	public static void wavePrint(int[][] arr, int m, int n) {

		for (int i = 0; i < m; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}

		}

	}
	
	public static void columnPrint(int[][] arr, int m, int n) {
		System.out.println();

		for (int j = 0; j < n; j++) {

			if (j % 2 == 0) {
				for (int i = 0; i < m; i++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int i = n - 1; i >= 0; i--) {
					System.out.print(arr[i][j] + " ");
				}
			}

		}

	}
}