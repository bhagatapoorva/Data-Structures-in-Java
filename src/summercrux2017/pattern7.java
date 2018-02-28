package summercrux2017;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, val = 0;
		while(row<=n){
			int space = 1;
			while(space<=n-row){
				System.out.print("\t");
				space +=1;
			}
			val = row;
			System.out.print(val);
			System.out.print("\t");
			while(val<(2*row)-1){
				val +=1;
				System.out.print(val);
				System.out.print("\t");
				
				
			}
			while(val>row){
				val -=1;
				System.out.print(val);
				System.out.print("\t");
			}
			row +=1;
			System.out.print("\n");
		}

	}

}
