package june12;

import java.util.Scanner;

public class arrayLinearSearch {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeinput();
		System.out.println("enter number to search");
		int num = scn.nextInt();
		System.out.println("the number is found at " + linearsearch(arr, num) + "th position");

	}

	public static int[] takeinput() {
		System.out.println("enter size");
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			System.out.println("enter value of " + i + "th position");
			rv[i] = scn.nextInt();

		}
		return rv;

	}

	public static int linearsearch(int[] arr, int n) {
		int a = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				
				return i;
			}

		}
		return a;

	}
}
