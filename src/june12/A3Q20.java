package june12;

import java.util.Scanner;

public class A3Q20 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		char check='p';
		
		while(check!='x'||check!='X'){
			System.out.println("enter the first number");
			int n1 = scn.nextInt();
			System.out.println("enter the second number");
			int n2 = scn.nextInt(); 
			System.out.println("enter charater");
			char ch = scn.next(".").charAt(0);
			
			if(ch=='+'){
				System.out.println(n1+n2);
			}
			else if(ch=='-'){
				System.out.println(n1-n2);
			}
			else if(ch=='*'){
				System.out.println(n1*n2);
			}
			else if(ch=='/'){
				System.out.println(n1/n2);
			}
			else if(ch=='%'){
				System.out.println(n1%n2);
			}
			else{
				System.out.println("invalid operation");
			}
			
			 check = scn.next(".").charAt(0);
		}
	}

}
