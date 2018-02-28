package june09;

import java.util.Scanner;

public class decimal2binary {

	public static void main(String[] args) {
		int binary =0 , c = 1, rem = 0;
		System.out.println("enter decimal number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while(n!=0){
			 rem = n%2;
			n = n/2;
			binary = binary+ rem*c;
			c= 10*c;
			
			
		}
		
		System.out.println(binary);
		
	}

}
