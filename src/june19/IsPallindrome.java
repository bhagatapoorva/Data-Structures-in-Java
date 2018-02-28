package june19;

import java.util.Scanner;

public class IsPallindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();

		System.out.println(pallindrome(s));

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
