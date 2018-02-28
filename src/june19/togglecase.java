package june19;

import java.util.Scanner;

public class togglecase {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		String s = scn.nextLine();
		System.out.print(togglecase(s));

	}
	
	public static String togglecase(String s){
		StringBuilder sb= new StringBuilder();
		for(int i = 0;i<s.length();i++){
			
			int a = (int)(s.charAt(i));
			
			if(a>=97&&a<=123){
				 a = a-32;
			}
			else if(a>=65&&a<=91){
				 a=a+32;
			}
			sb.append((char)a);
		}
		return sb.toString();
	}

}
