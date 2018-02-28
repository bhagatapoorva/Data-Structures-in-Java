package june12;

import java.util.Scanner;

public class A3Q17 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter number");
		int n = scn.nextInt();
		System.out.println("enter PRECISION number");
		int p = scn.nextInt();
		System.out.println("The square of " + n + " to the precison " + p + " is " + dofunc(n, p));

	}

	public static double dofunc(int n, int p) {
		double root = 0;
		double inc = 1;
		int mult=1;
		double div=1.0;
		int count = 0;
		while (count <= p) {
			while (root * root <= n) {
				Math.round((root*mult)/div);
				root += inc;
				
			}
			root = root - inc;
			count++;
			mult=mult*10;
			div=div*10;
			inc=inc*0.1;
		}
		return Math.round((root*mult)/div);

	}

}
