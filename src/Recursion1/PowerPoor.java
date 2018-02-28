package Recursion1;

import java.util.Scanner;

public class PowerPoor {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.println("enter x");
		int k = scn.nextInt();
		System.out.println("enter n");
		int n = scn.nextInt();
		System.out.println(powerpoor(k,n));

	}
	public static int powerpoor(int x, int n ){
		if(n==0){
			return 1;
		}
		int pmn=powerpoor(x,n-1);
		int pn=pmn*x;
		return pn;
	}

}
