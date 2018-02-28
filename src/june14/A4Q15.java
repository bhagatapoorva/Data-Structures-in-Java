package june14;

import java.util.Scanner;

public class A4Q15 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeinput();
		
		System.out.println();
		combinations(arr);
	}
	public static int[] takeinput() {
		System.out.println("enter size");
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			int p = i + 1;
			System.out.println("enter value of " + p + " position");
			rv[i] = scn.nextInt();

		}
		return rv;

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void combinations(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			for (int j = i + 1; j < arr.length ; j++) {
				System.out.println(arr[i]+" "+arr[j]);
				for (int k = j + 1; k < arr.length; k++) {
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
				}

			}

		}
	}
}
