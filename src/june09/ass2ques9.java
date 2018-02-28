package june09;

import java.util.Scanner;

public class ass2ques9 {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 0, val = 1;
		while(row<n){
			int col = 0;
			val = 1;
			while(col<=row){
				System.out.print(val + "\t");
				val = (val*(row-col))/(col+1);
				
				col +=1;
			}
			row +=1;
			System.out.print("\n");
		}

	}

}
