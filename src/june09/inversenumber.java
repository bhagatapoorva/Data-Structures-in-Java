package june09;

import java.util.Scanner;

public class inversenumber {

	public static void main(String[] args) {
		System.out.println("enter  number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int num = n, count = 0, number = 0;
		while(num!=0){
			int rem = num%10;
			num = num/10;
			count++;
		}
		
		int c = 1;
		while(c<=count){
			int rem = n%10;
			
			int pow = (int)Math.pow(10,rem-1);
			number += c*pow;
			c++;
			n = n/10;
		}
		System.out.println(number);

	}

}
