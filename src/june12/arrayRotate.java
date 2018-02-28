package june12;

import java.util.Scanner;

public class arrayRotate {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeinput();
		display(arr);
		System.out.println("\n");
		int[] arr2 = rotate(arr);
		System.out.println("\n");
		display(arr2);
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

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] rotate(int[] arr) {
		System.out.println("enter rotation number");
		int n = scn.nextInt();
		n=n%arr.length;
		int i = 0, right = arr.length - n, csp = 1;
		int[] arr2 = new int[arr.length];
		while (right < arr.length) {

			arr2[i] = arr[right];
			i++;
			right++;
		}
		int j = 0;
		while (j < arr.length - n) {
			arr2[i] = arr[j];
			j++;
			i++;

		}

		return arr2;

	}

}
