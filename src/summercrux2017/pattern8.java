package summercrux2017;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, val = 0, nsp = n-1, nst = 1;
		while(row<=(2*n-1)){
			int csp = 1;
			while(csp<=nsp){
				System.out.print("\t");
				csp++;
			}
			if(row<=n){
				val++;
			}
			else{
				val--;
			}
			int a=val;
			int cst = 1;
			while(cst<=nst){
				System.out.print(a);
				System.out.print("\t");
				if(cst<=nst/2){
					a++;
				}
				else{
					a--;
				}
				cst++;
			}
			if(row<=n-1){
				nst +=2;
				nsp--;
			}
			else{
				nst -=2;
				nsp++;
			}
			row +=1;
			System.out.print("\n");
		}

	}

}
