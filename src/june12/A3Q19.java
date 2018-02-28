package june12;

import java.util.Scanner;

public class A3Q19 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter size");
		int n = scn.nextInt();
		int check = 0;
		System.out.println("enter " + n + " values");

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = scn.nextInt();
			if (i != 0&&i!=n/2) {
				if (i < n / 2) {
					if (arr[i] > arr[i - 1]) {
						check = 1;
						
					}

				} else {
					if (arr[i] < arr[i - 1]) {
						check = 1;
						
					}
				}
			}
		}
		if (check == 0)
			System.out.println("true");
		else
			System.out.println("false");

	}

}
