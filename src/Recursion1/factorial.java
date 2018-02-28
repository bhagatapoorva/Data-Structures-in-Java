package Recursion1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.println("enter k");
		int k = scn.nextInt();
		int n=factorial(k);
		System.out.println(n);

	}
	public static int factorial(int n){
		if(n==0){
			return 1;
		}
		int fmn=factorial(n-1);
		int fn=n*fmn;
		return fn;
	}

}
