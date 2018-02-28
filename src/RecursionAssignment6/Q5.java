package RecursionAssignment6;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int val=nthtriangle(n);
		System.out.println(val);
	}
	
	public static int nthtriangle(int n){
		if(n==0){
			return 0;
		}
		
		int val=nthtriangle(n-1);
		val+=n;
		return val;
	    
		
	}

}
