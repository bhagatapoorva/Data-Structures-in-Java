package june09;

import java.util.Scanner;

public class startbase2decimal {

	public static void main(String[] args) {
		int decimal =0 , c = 1, rem = 0;
		System.out.println("enter start base number");
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("enter start base");
		int sb = scn.nextInt();
		while(n!=0){
			 rem = n%10;
			n = n/10;
			decimal =  decimal+ rem*c;
			c= sb*c;
			
			
		}
		
		System.out.println(decimal);

	}

}
