package Recursion3;

import java.util.ArrayList;

public class permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "abc";
		ArrayList mr = getpermutations(one);
		System.out.println(mr);
	}

	public static ArrayList<String> getpermutations(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);

		String ros = str.substring(1);

		ArrayList<String> rr = getpermutations(ros);
		ArrayList<String> mr = new ArrayList<>();

		for (String rs : rr) {

			for (int i = 0; i <= rs.length(); i++) {
				StringBuilder sb = new StringBuilder(); // String m = rs.substring(0,i)+ch+rs.substirng(i);
				sb.append(rs);                          // mr.add(m);
				sb.insert(i, ch);
				String m = sb.toString();
				mr.add(m);

			}
		}

		return mr;

	}
}
