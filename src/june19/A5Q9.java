package june19;

import java.util.Scanner;

public class A5Q9 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String s = scn.nextLine();
		System.out.println(noduplicate(s));

	}

	public static String noduplicate(String s) {
		char ch = '\0';
		int previous = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < s.length(); i++) {
			ch = s.charAt(previous);
			if (s.charAt(i) == s.charAt(previous)) {

				continue;
			} else {
				sb.append(ch);
				previous = i;

			}
		}
		ch = s.charAt(s.length() - 1);
		sb.append(ch);
		return sb.toString();

	}
}
