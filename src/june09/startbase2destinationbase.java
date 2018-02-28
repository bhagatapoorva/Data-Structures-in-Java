package june09;

import java.util.Scanner;

public class startbase2destinationbase {

	public static void main(String[] args) {
		
		int decimal =0 , c = 1, rem = 0, output = 0;
		System.out.println("enter number");
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("enter start base");
		int sb = scn.nextInt();
		System.out.println("enter destination base");
		int db = scn.nextInt();
		while(n!=0){
			rem = n%10;
			n = n/10;
			decimal += rem*c;
			c = c*sb;
		}
		c = 1;
			
			while(decimal!=0){
				rem = decimal%db;
				decimal = decimal/db;
				output += rem*c;
				c = c*10;
				
			}
			System.out.println(output);
			
		}
		
	}


