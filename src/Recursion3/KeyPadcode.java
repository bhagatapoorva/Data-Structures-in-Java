package Recursion3;

import java.util.ArrayList;

public class KeyPadcode {

	public static void main(String[] args) {
		String one = "21";
		ArrayList mr = kpc(one);
		System.out.println(mr);

	}

	public static ArrayList<String> kpc(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String s = getcode(ch);
		String ros = str.substring(1);

		ArrayList<String> rr = kpc(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (String rs : rr) {
			for (int i = 0; i < s.length(); i++) {
				mr.add(s.charAt(i) + rs);
			}
		}
		return mr;

	}

	public static String getcode(char ch) {
		if (ch == '1') {
			return "abc";
		} else if (ch == '2') {
			return "def";
		} else if (ch == '3') {
			return "ghi";
		} else if (ch == '4') {
			return "jkl";
		} else if (ch == '5') {
			return "mno";
		} else if (ch == '6') {
			return "pqrs";
		} else if (ch == '7') {
			return "tuv";
		} else if (ch == '8') {
			return "wx";

		} else if (ch == '9') {
			return "yz";
		} else {
			return ",";
		}
	}

}
