package assignments;

public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-geerated method stub

		// q1("1235",0); int mr = q2("123477"); System.out.println(mr);

		// System.out.println(q3("hey","yeh"));
		// System.out.println(q3("hey","byee"));
		// System.out.println(q4("nitin"));
		// System.out.println(q4("wassup"));
		// System.out.println(q5("hello", ""));
		// System.out.println(q6("hello",""));
		// System.out.println(ques6("hheelloo"));
		// q7("abexexdexed","",0);
		// System.out.println(q8a("hhihithithihihit"));
		// System.out.println(q8b("hihithithiit"));
		// q8c("ihit", "");
		// System.out.println(q9a("hihithihitt"));
		// q9b("hihiyhi","");
		// q9c("hihithithi", "");
		// System.out.println(q10("AXAXA"));
		// System.out.println(q11a("aaaataabaaaaa"));
		// System.out.println(q11b("aaaaaabaaaa"));
		// q12("1123", "");
		System.out.println(q14("xyz(abc)def"));

	}
	public static void q1(String ques, int ans) {
		if (ques.length() == 1) {
			ans += ques.charAt(0) - '0';
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		int c = ch - '0';
		String roq = ques.substring(1);
		q1(roq, ans + c);
	}

	public static int q2(String ques) {
		if (ques.length() == 1) {
			return ques.charAt(0) - '0';
		}
		String roq = ques.substring(0, ques.length() - 1);
		char ch = ques.charAt(ques.length() - 1);
		int rr = q2(roq);
		return (rr * 10) + (ch - '0');
	}

	public static boolean q3(String s1, String s2) {
		if (s1.length() == 0 && s2.length() == 0) {
			return true;
		}

		if (s1.charAt(0) != s2.charAt(s2.length() - 1) || s1.length() != s2.length()) {
			return false;
		}
		String roq1 = s1.substring(1);
		String roq2 = s2.substring(0, s2.length() - 1);
		boolean check = q3(roq1, roq2);
		return check;

	}

	public static boolean q4(String ques) {
		if (ques.length() == 0 || ques.length() == 1) {
			return true;
		}

		if (ques.charAt(0) != ques.charAt(ques.length() - 1)) {
			return false;
		}

		String roq = ques.substring(1, ques.length() - 1);
		boolean check = q4(roq);
		return check;
	}

	public static String q5(String ques, String ans) {
		if (ques.length() == 1) {
			return ans + ques.charAt(0);
		}
		String mr = null;
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		if (ques.charAt(0) == ques.charAt(1)) {
			mr = q5(roq, ans + ch + "*");
		} else {
			mr = q5(roq, ans + ch);
		}
		return mr;
	}

	public static String q6(String ques, String ans) {
		if (ques.length() == 1) {
			return ans + ques.charAt(0);
		}
		String mr = null;
		String roq = ques.substring(1);
		char ch = ques.charAt(0);
		if (ques.charAt(0) == ques.charAt(1)) {
			mr = q6(roq, ans);
		} else {
			mr = q6(roq, ans + ch);
		}
		return mr;
	}

	public static String ques6(String ques) { /* ALTERNATIVE QUES 6 */
		if (ques.length() == 1) {
			String br = "";
			br = ques;
			return br;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		String mr = ques6(roq);
		if (ch != mr.charAt(0)) {

			mr = ch + mr;
		}
		return mr;

	}

	public static void q7(String ques, String ans, int count) {
		if (ques.length() == 0) {
			System.out.println(count);
			for (int i = 0; i < count; i++) {
				ans = ans + "x";
			}
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		if (ch == 'x') {
			q7(roq, ans, count + 1);
		} else {
			q7(roq, ans + ch, count);
		}
	}

	// WRITE ALTERNATE CODE OF 7 WITHOUT USONG COUNT

	public static int q8a(String ques) {
		if (ques.length() == 2) {
			if (ques.equals("hi")) {
				return 1;
			} else {
				return 0;
			}
		}

		String ch = ques.substring(0, 2);
		String roq = ques.substring(1);
		int count = q8a(roq);
		if (ch.equals("hi")) {
			return count + 1;
		} else {
			return count;
		}

	}

	public static String q8b(String ques) {
		if (ques.length() == 1 || ques.length() == 2) {
			String br = "";
			if (ques.equals("hi")) {

			} else {
				br = ques;
			}

			return br;
		}

		char ch0 = ques.charAt(0), ch1 = ques.charAt(1);

		String roq = null;
		String mr = null;
		if (ch0 == 'h' && ch1 == 'i') {
			roq = ques.substring(2);
			mr = q8b(roq);

		} else {
			roq = ques.substring(1);
			mr = q8b(roq);
			mr = ch0 + mr;
		}
		return mr;

	}

	public static void q8c(String ques, String ans) {
		if (ques.length() <= 2) {
			if (ques.equals("hi")) {
				System.out.println(ans + "bye");
			} else {
				System.out.println(ans + ques);
			}
			return;
		}

		char ch0 = ques.charAt(0), ch1 = ques.charAt(1);
		String roq = "";
		if (ch0 == 'h' && ch1 == 'i') {
			roq = ques.substring(2);
			q8c(roq, ans + "bye");
		} else {
			roq = ques.substring(1);
			q8c(roq, ans + ch0);
		}
	}

	public static int q9a(String ques) {

		if (ques.length() <= 2) {
			if (ques.equals("hi")) {
				return 1;
			} else {
				return 0;
			}
		}

		char ch0 = ques.charAt(0), ch1 = ques.charAt(1), ch2 = ques.charAt(2);
		String roq = null;
		int count = 0;
		if (ch0 == 'h' && ch1 == 'i') {
			if (ch2 == 't') {
				roq = ques.substring(3);
				count = q9a(roq);
			} else {
				roq = ques.substring(2);
				count = q9a(roq);
				count++;
			}
		} else {
			roq = ques.substring(1);
			count = q9a(roq);

		}
		return count;

	}

	public static void q9b(String ques, String ans) {
		if (ques.length() <= 2) {
			if (ques.equals("hi")) {

			} else {
				ans = ans + ques;
			}
			System.out.println(ans);
			return;
		}

		char ch0 = ques.charAt(0), ch1 = ques.charAt(1), ch2 = ques.charAt(2);
		String roq = null;
		if (ch0 == 'h' && ch1 == 'i') {
			if (ch2 == 't') {
				roq = ques.substring(3);
				q9b(roq, ans + ques.substring(0, 3));

			} else {
				roq = ques.substring(2);
				q9b(roq, ans);
			}
		} else {
			roq = ques.substring(1);
			q9b(roq, ans + ch0);
		}
	}

	public static void q9c(String ques, String ans) {
		if (ques.length() <= 2) {
			if (ques.equals("hi")) {
				ans = ans + "bye";
			} else {
				ans = ans + ques;
			}
			System.out.println(ans);
			return;
		}
		char ch0 = ques.charAt(0), ch1 = ques.charAt(1), ch2 = ques.charAt(2);
		String roq = null;
		if (ch0 == 'h' && ch1 == 'i') {
			if (ch2 == 't') {
				roq = ques.substring(3);
				q9c(roq, ans + ques.substring(0, 3));

			} else {
				roq = ques.substring(2);

				q9c(roq, ans + "bye");
			}
		} else {
			roq = ques.substring(1);
			q9c(roq, ans + ch0);
		}

	}

	public static int q10(String ques) {
		if (ques.length() == 3) {
			if (ques.charAt(0) == ques.charAt(2)) {
				return 1;
			} else {
				return 0;
			}
		}

		String roq = ques.substring(1);
		int count = q10(roq);
		if (ques.charAt(0) == ques.charAt(2)) {
			return count + 1;
		} else {
			return count;
		}
	}

	public static int q11a(String ques) {
		if (ques.length() == 3) {
			if (ques.equals("aaa")) {
				return 1;
			} else {
				return 0;
			}
		}
		String roq = ques.substring(1);

		int count = q11a(roq);
		if (ques.substring(0, 3).equals("aaa")) {
			return count + 1;
		} else {
			return count;
		}
	}

	public static int q11b(String ques) {
		if (ques.length() <= 2) {

			return 0;

		}
		String roq = null;

		int count = 0;
		if (ques.substring(0, 3).equals("aaa")) {
			roq = ques.substring(3);
			count = q11b(roq);
			return count + 1;
		} else {
			roq = ques.substring(1);
			count = q11b(roq);
			return count;
		}
	}

	public static void q12(String ques, String ans) {
		if (ques.length() <= 1) {
			if (ques.length() == 1) {
				int ch = ques.charAt(0) - '0';
				ans = ans + (char) ('a' + ch - 1);
			}
			System.out.println(ans);
			return;
		}

		int ch = ques.charAt(0) - '0';
		q12(ques.substring(1), ans + (char) ('a' + ch - 1));
		String s = ques.substring(0, 2);
		int ch1 = s.charAt(0) - '0', ch2 = s.charAt(1) - '0', chf = (ch1 * 10) + ch2;
		if (chf <= 26) {
			q12(ques.substring(2), ans + (char) ('a' + chf - 1));
		}

	}

	public static String q14(String ques) {
		if (ques.charAt(0) == '(') {
			StringBuilder sb = new StringBuilder();
			for (int i = 1; ques.charAt(i) != ')'; i++) {
				sb.append(ques.charAt(i));
			}

			return sb.toString();

		}
		
		String ans = q14(ques.substring(1));
		return ans;
	}

}
