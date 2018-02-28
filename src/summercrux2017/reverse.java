package summercrux2017;


import java.util.Scanner;

public class reverse {

	

	public static void main(String[] args) {
		
		int rev = 0;
		System.out.println("enter the number");
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while(n>0){
			int a = n%10;
			rev = rev*10+a;
			n = n/10;
		}
		System.out.println(rev);
		}
}
		
		
		
		
				

	

	
