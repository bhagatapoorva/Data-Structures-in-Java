package june19;

import java.util.Scanner;

public class diffofascii {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next(); 
		System.out.println(print(s));

	}
	public static String print(String s){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length()-1;i++){
			char ch=s.charAt(i);
			sb.append(ch);
			int ascii=(int)(s.charAt(i+1)-s.charAt(i));
			sb.append(ascii);
		
					
		}
		sb.append(s.charAt(s.length()-1));
		return sb.toString();
		
	}
}
