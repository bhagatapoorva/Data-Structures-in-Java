package home;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum=0;
		while(n>0){
		    int rem=n%10;
		     sum=sum*10+rem;
		    n=n/10;
		}
			System.out.print(sum);

	}

}
