package home;

import java.util.ArrayList;

public class ARRAYPRINTSUBSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String a = q12("1123","");
		// System.out.println(a);
		// int[] arr = {1,2,3,4,5};
		// int[] arr2 = new int[arr.length];
		// printTargetSS(arr,0,6,arr2);
		// System.out.println(subset("abc"));
		// ss("abc","");
		// kpc("12","");
		// System.out.println(keypad("12"));
		// System.out.println(count("123"));
		// System.out.println(p("abc"));
		// System.out.println(pcount("abcd"));
		q9(1, 1000);

	}

	public static String q12(String ques, String ans) {
		if (ques.length() <= 1) {
			if (ques.length() == 1) {
				int ch = ques.charAt(0) - '0';
				ans = ans + (char) ('a' + ch - 1);
			}

			return ans;
		}

		int ch = ques.charAt(0) - '0';
		String ans1 = q12(ques.substring(1), ans + (char) ('a' + ch - 1));
		String s = ques.substring(0, 2);
		int ch1 = s.charAt(0) - '0', ch2 = s.charAt(1) - '0', chf = (ch1 * 10) + ch2;
		String ans2 = null;
		if (chf <= 26) {
			ans2 = q12(ques.substring(2), ans + (char) ('a' + chf - 1));
		}
		String ans3 = ans1 + "\n" + ans2;
		return ans3;

	}

	public static void printTargetSS(int[] arr, int vidx, int target, int[] asf) {
		if (vidx == arr.length) {
			if (target == 0) {
				for (int i = 0; i < asf.length; i++)
					System.out.print(asf[i]);

			}
			System.out.println();
			return;
		}

		printTargetSS(arr, vidx + 1, target, asf); // no
		asf[vidx] = arr[vidx];
		printTargetSS(arr, vidx + 1, target - arr[vidx], asf); // yes
	}

	public static ArrayList subset(String ques) {
		if (ques.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = ques.charAt(0);
		ArrayList<String> rr = subset(ques.substring(1));
		ArrayList<String> mr = new ArrayList<>();
		for (String rs : rr) {
			mr.add(rs);
			mr.add(ch + rs);
		}
		return mr;
	}

	public static void ss(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + "," + "\t");
			return;
		}

		String roq = ques.substring(1);
		char ch = ques.charAt(0);

		ss(roq, ans + ch);
		ss(roq, ans);
	}

	public static void kpc(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		String roq = ques.substring(1);
		char ch = ques.charAt(0);
		for (int i = 0; i < getcode(ch).length(); i++) {
			kpc(roq, ans + getcode(ch).charAt(i));

		}
	}

	public static ArrayList<String> keypad(String ques) {
		if (ques.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		ArrayList<String> rr = keypad(roq);
		ArrayList<String> mr = new ArrayList<>();
		String s = getcode(ch);
		for (String rs : rr) {
			for (int i = 0; i < getcode(ch).length(); i++) {
				mr.add(s.charAt(i) + rs);
			}
		}
		return mr;
	}

	public static int count(String ques) {
		if (ques.length() == 0) {
			return 1;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		int c = 0;
		for (int i = 0; i < getcode(ch).length(); i++) {
			c += count(roq);
		}
		return c;
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

	public static ArrayList<String> p(String ques) {
		if (ques.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		ArrayList<String> rr = p(roq);
		ArrayList<String> mr = new ArrayList<>();
		for (String rs : rr) {
			for (int i = 0; i <= rs.length(); i++) {
				StringBuilder sb = new StringBuilder();
				sb.append(rs);
				sb.insert(i, ch);
				String fr = sb.toString();
				mr.add(fr);
			}
		}
		return mr;
	}

	public static int pcount(String ques) {
		if (ques.length() == 0) {
			return 1;
		}

		int count = 0;
		boolean[] arr = new boolean[256];
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			if (arr[ch] == false) {
				count += pcount(roq);
				arr[ch] = true;
			}

		}
		return count;

	}

	public static void q9(int current, int max) {

		System.out.println(current);

		int c = current * 10;

		for (int i = c; i < c + 10; i++) {
			if (i <= max) {
				q9(i, max);
			}
		}

		if (current <= 9) {
			q9(current + 1, max);
		}

	}
}
