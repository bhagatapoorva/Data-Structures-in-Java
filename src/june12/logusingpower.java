package june12;

import java.util.Scanner;

public class logusingpower {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scn= new Scanner(System.in);
		int x = scn.nextInt();
		
	     
		System.out.println("enter power number");
		int n = scn.nextInt();
		
	     
		int p=pow(x,n);
		System.out.println(p);
		System.out.println("enter log number");
		int l = scn.nextInt();
		System.out.println("enter base number");
		int b = scn.nextInt();
		log(l,b);

	}
	public static int pow(int x, int n){
		int power= (int)Math.pow(x, n);
		return power;
	}
	public static void log(int l, int b){
		int counter=1;
		int c=b;
		while(c!=l){
			c= pow(b,counter);
			counter+=1;
			
		}
		counter--;
		System.out.println(counter);
		
		
		
		/* OR
		 *  int counter=1;
		  while(true){
		       int m = pow(b,counter);
		           if(m==l){
		                 break;
		           }
		        counter++;
		  }
		  System.out.println(counter);
		 
		*/
		
	}

}
