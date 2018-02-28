package summercrux2017;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		while(row<=n){
			int col = 1;
			while(col<=row){
				if(col==row||col==1){
					System.out.print(row);
					
				}
				else{
					System.out.print("0");
				}
				System.out.print("\t");
				col +=1;
					
			}
			row +=1;
			System.out.print("\n");
		}

	}

}
