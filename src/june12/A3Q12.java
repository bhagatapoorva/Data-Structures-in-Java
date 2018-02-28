package june12;

import java.util.Scanner;

public class A3Q12 {
	
	public static void main(String[] args) {
		System.out.println("enter FIRST  number");
		int n1 = scn.nextInt();
		System.out.println("enter SECOND number");
		int n2 = scn.nextInt();
		System.out.println("The LCM of " + n1 + " and " + n2 + " is " + gcd(n1, n2));
	}

	public static int gcd(int n1, int n2) {
		int rem = 1, divs = n1, divd = n2;
		rem = divd % divs;
		while (rem > 0) {

			divd = divs;
			divs = rem;
		rem = divd % divs;
		}
			
		int lcm=(n1*n2)/divs;
		return lcm;

	}

	}


