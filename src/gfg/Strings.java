package gfg;

import java.util.Scanner;

public class Strings {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of outputs required");
		int n1 = scn.nextInt();

		for (int i = 0; i < n1; i++) {
			System.out.println("Enter first string");
			String s1 = scn.next();
			System.out.println("Enter second string");
			String s2 = scn.next();
			String s3 = s1 + s2;
			System.out.println(s3);
			
			int j = 0, k = 0;
			int mid = s3.length()/2;
			while(j<=mid){
				char c = s3.charAt(j);
				s3.set = s3.charAt(k);
				
			}

		}

	}

}
