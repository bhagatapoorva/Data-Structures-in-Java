package june09;

import java.util.Scanner;

public class binary2decimal {

	public static void main(String[] args) {
		int decimal =0 , c = 1, rem = 0;
		System.out.println("enter binary number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while(n!=0){
			 rem = n%10;
			n = n/10;
			decimal =  decimal+ rem*c;
			c= 2*c;
			
			
		}
		
		System.out.println(decimal);
		
	}

}
