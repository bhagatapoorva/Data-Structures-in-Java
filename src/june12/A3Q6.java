package june12;

import java.util.Scanner;

public class A3Q6 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("ENTER NUMBER");
		int n = scn.nextInt();
		System.out.println("enter digit to search");
		int d = scn.nextInt();
		System.out.println("digit "+d+" is repeated "+ countdigit(n,d)+" times");
		
		

	}
	public static int countdigit(int n, int d){
		int count=0;
		while(n>0){
			int rem = n%10;
			if(rem==d){
				count++;
			}
			n=n/10;
		}
		return count;
		
	}

}
