package summercrux2017;

import java.util.Scanner;

public class printprime {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("2");
		int num = 3;
		while(num<=n) {
			int check = 2;
			while(check<num) {
				if(num%check==0) {
					
					break;

				}
				check++;

			}
			if(check==num)
				System.out.println(num);
			
			num +=1;
		}
	}
}
