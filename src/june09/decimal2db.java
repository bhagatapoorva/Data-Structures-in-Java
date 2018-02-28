package june09;

import java.util.Scanner;

public class decimal2db {

	public static void main(String[] args) {
		int binary =0 , c = 1, rem = 0;
		System.out.println("enter decimal number");
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("enter destination base");
		int db = scn.nextInt();
		while(n!=0){
			 rem = n%db;
			n = n/db;
			binary = binary+ rem*c;
			c= 10*c;
			
			
		}
		
		System.out.println(binary);
		

	}

}
