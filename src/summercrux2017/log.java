package summercrux2017;

import java.util.Scanner;

public class log {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
			int n1 = scn.nextInt();
			int n2 = scn.nextInt();
			int l=log(n1,n2);
			System.out.println(l);
	        

	}
	 public static int log(int n1, int n2){
	        int num=n1, count=0;
	        while(num>=1){
	           num= num/n2;
	            count++;
	            
	        }
	        return count-1;
	    }
}
