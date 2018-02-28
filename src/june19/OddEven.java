package june19;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		String s = scn.nextLine();
		System.out.println(oddeven(s));

	}
	public static String oddeven(String s){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(i%2==0){
				int ch=(int)(s.charAt(i))+1;
				char cha=(char)ch;
				sb.append(cha);
			}
			else{
				int ch=(int)(s.charAt(i))-1;
				char cha=(char)ch;
				sb.append(cha);
			}
		}
		return sb.toString();
	}
}
