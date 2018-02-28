package home;

import java.util.Scanner;

public class checkprime {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
	       for(int i=2;i<n;i++){
	           if(n%i==0){
	               System.out.println("Not Prime");
	               return;
	           }
	       }
	       System.out.println("Prime");
	      

	}

}
