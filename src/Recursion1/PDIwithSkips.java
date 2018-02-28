package Recursion1;

import java.util.Scanner;

public class PDIwithSkips {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.println("enter k");
		int k = scn.nextInt();
		pdiwithskips(k);

	}
	public static void pdiwithskips(int n){
		if(n==0){
			return;
		}
		if(n%2!=0){
		System.out.println("hi "+ n);
		}
		pdiwithskips(n-1);
		if(n%2==0){
			System.out.println("bye "+n);
		}
	}

}
