package Recursion1;

import java.util.Scanner;

public class PowerBetter {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter x");
		int k = scn.nextInt();
		System.out.println("enter n");
		int n = scn.nextInt();
		System.out.println(powerbetter(k, n));

	}

	public static int powerbetter(int x, int n) {
		
		if (n == 0) {
			return 1;
		}
		
		 int pnm =  powerbetter(x,n/2);
		int pn= pnm*pnm;
		
		if(n%2!=0){
			pn=pn*x;
		}
		return pn;
	}
}
