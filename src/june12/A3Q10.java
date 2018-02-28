package june12;

import java.util.Scanner;

public class A3Q10 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter STARTING  number");
		int n1 = scn.nextInt();
		System.out.println("enter ENDING  number");
		int n2 = scn.nextInt();
		armstrong(n1, n2);

	}

	public static void armstrong(int n1, int n2) {
		int n = n1 + 1;
		while (n < n2) {
			int num = n, count = 0, number = 0;
			while (num != 0) {
				int rem = num % 10;
				num = num / 10;
				count++;
			}
			num = n;
			while (num != 0) {
				int rem = num % 10;
				number += (int) Math.pow(rem, count);
				num = num / 10;
			}
			if (number == n) {
				System.out.println(n);

			}
			n++;
		}
	}

}
