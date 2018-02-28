package june09;

import java.util.Scanner;

public class rotatenumber {

	public static void main(String[] args) {
		int  count = 0, newnum = 0;
		System.out.println("enter  number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("enter rotation number");
		
		int r = scn.nextInt();
		int num = n;
		while(num!=0){
			int rem = num%10;
			num = num/10;
			count++;
		}
		int t = r%count;
		int pow = (int)Math.pow(10,r);
		int rem = n%pow;
		n = n/pow;
		int power = (int)Math.pow(10,count-t);
//		System.out.println(power+" "+t+" "+r);
		newnum = rem*power+n;
		System.out.println(newnum);
	}
}
