package june12;

import java.util.Scanner;

public class A3Q16 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.println("enter number");
		int n = scn.nextInt();
		System.out.println("The integral part of square root of "+n+" is "+sqroot(n));
		
		
		
	}
	public static int sqroot(int n){
		int root= 0;
		while(root*root<=n){
			root+=1;
		}
		
		return root-1;
		
	}

}
