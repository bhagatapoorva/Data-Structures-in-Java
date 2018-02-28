package june12;

import java.util.Scanner;

public class A3Q15 {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter N1  number");
		int n1 = scn.nextInt();
		System.out.println("enterN2 number");
		int n2 = scn.nextInt(); 
		dofunc(n1,n2);
		
	}
	public static void dofunc(int n1, int n2){
		int count=1, n=1;
		while(count<=n1){
			int print= 3*n+2;
			if(print%n2!=0){
				System.out.println(print);
				count+=1;
			}
			n+=1;
			
				
			
		}
	}

}
