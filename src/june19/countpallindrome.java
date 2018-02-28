package june19;

import java.util.Scanner;

public class countpallindrome {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String s = scn.nextLine();
		
		
		System.out.println(countpallindrome(s));
	}

	public static int countpallindrome(String s) {

		int number = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String k = s.substring(i, j);
				boolean check = (pallindrome(k));
				if (check == true) {
					number += 1;
				}
			}
		}
		return number;
	}

	public static boolean pallindrome(String s) {
		int i = s.length() - 1, c = 0;

		for (int count = 0; count < s.length() / 2; count++) {

			if (s.charAt(i) != s.charAt(c)) {
				return false;
			}
			i--;
			c++;

		}
		return true;

	}
}
