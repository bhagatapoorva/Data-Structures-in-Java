package june12;

import java.util.Scanner;

public class A3Q9 {

	public static void main(String[] args) {
		System.out.println("enter  number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(armstrong(n));

	}

	public static boolean armstrong(int n) {
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
			return true;
		} else {

			return false;
		}

	}

}
