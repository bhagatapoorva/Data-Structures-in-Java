package june12;

import java.util.Scanner;

public class fahrenheit2celcius {

	public static void main(String[] args) {
		System.out.println("enter min fah");
		Scanner scn = new Scanner(System.in);
		int minf = scn.nextInt();
		
		System.out.println("enter max f");
		
		int maxf = scn.nextInt();
        System.out.println("enter step f");
		
		int stepf = scn.nextInt();
		
		int tempf=minf;
		while(tempf<=maxf){
			int c =(int)((5.0/9)*(tempf-32));
			System.out.println(tempf+"  "+c);
			
			tempf+=stepf;
		}
	}

}
