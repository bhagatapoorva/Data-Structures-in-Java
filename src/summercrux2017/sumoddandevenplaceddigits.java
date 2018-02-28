package summercrux2017;

import java.util.Scanner;

public class sumoddandevenplaceddigits {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int num = n, sumo = 0, sume = 0, count = 0;
		while(n>0){
			
			int rem = n%10;
			count++;
			if(count%2==0){
				sume +=rem;
			}
			else{
				sumo +=rem; 
			}
			n = n/10;
			
			
		
			
		}
		System.out.println(sumo);
		System.out.println(sume);
		
			
		
	}
}
