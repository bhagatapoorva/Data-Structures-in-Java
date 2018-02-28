package summercrux2017;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		System.out.println("enter the number");

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0, b = 1, c = 1, count = 0;

		while (count <= n) {
			if (count == n) {
				System.out.println(a);
			}
			c = a + b;
			a = b;
			b = c;
			count++;
		}
	}

}
