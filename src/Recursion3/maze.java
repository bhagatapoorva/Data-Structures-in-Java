package Recursion3;

import java.util.ArrayList;

public class maze {

	public static void main(String[] args) {

		ArrayList<String> list = getMazePaths(0, 0, 4, 4);
		System.out.println(list.size());

	}

	public static ArrayList<String> getMazePaths(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		if (cr < er) {
			ArrayList<String> rr = getMazePaths(cr + 1, cc, er, ec);
			for (String rs : rr) {
				mr.add("v" + rs);
			}

		}

		if (cc < ec) {
			ArrayList<String> rr = getMazePaths(cr, cc + 1, er, ec);
			for (String rs : rr) {
				mr.add("h" + rs);
			}
		}

		return mr;

	}

}
