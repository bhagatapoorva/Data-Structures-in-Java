package summercrux2017;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		
			System.out.println("enter number");
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			int row = 1, a = 0, b = 1, c = 0;
			while(row<=n){
				int col = 1;
				while(col<=row){
					System.out.print(a);
					System.out.print("\t");
					c = a+b;
					a = b;
					b = c;
					col +=1;
					
				}
				row +=1;
				System.out.print("\n");
			}

	}

}
