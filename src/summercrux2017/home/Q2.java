package home;
/*
 *    			1		
			1		1		
		1		0		1		
	1		0		0		1		
1		0		0		0		1		

 */

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		System.out.println("enter  number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row =1, nsp=n-1, nst=1;
		while(row<=n){
			int csp=1;
			while(csp<=nsp){
				System.out.print("\t");
				csp++;
			}
			int cst=1;
			while(cst<=nst){
				if(cst==1||cst==nst){
					System.out.print("1");
					
					
				}
				else{
					System.out.print("0");
					
				}
				System.out.print("\t");
				System.out.print("\t");
				cst++;
			}
			nsp -=1;
			nst +=1;
			row +=1;
			System.out.print("\n");
		}

	}

}
