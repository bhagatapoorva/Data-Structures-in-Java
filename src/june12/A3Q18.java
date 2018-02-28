package june12;

import java.util.Scanner;

public class A3Q18 {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter charater");
		char ch = scn.nextLine().charAt(0);
		System.out.println("The character "+ch+" is "+checkcharacter(ch));
		

	}
	public static char checkcharacter(char ch){
	
		if(ch>='A'&&ch<='Z'){
		return 'U';
		}
		else if(ch>='a'&&ch<='z'){
			return 'L';
			
		}
		else{
			return 'I';
		}
		
	}

}
