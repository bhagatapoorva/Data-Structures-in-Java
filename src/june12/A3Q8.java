package june12;

import java.util.Scanner;

public class A3Q8 {

	public static void main(String[] args) {
		System.out.println("enter  number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		System.out.println(checkmirror(n));

	}

	public static boolean checkmirror(int n) {
		int num = n, count = 0, number = 0;
		while (num != 0) {
			int rem = num % 10;
			num = num / 10;
			count++;
		}
		num = n;

		int c = 1;
		while (c <= count) {
			int rem = num % 10;

			int pow = (int) Math.pow(10, rem - 1);
			number += c * pow;
			c++;
			num = num / 10;
		}
		System.out.println(number);
		if (n == number) {
			return true;
		} else {
			return false;
		}
		

	}

}
