package Recursion3;

import java.util.ArrayList;

public class mazeQueen {

	public static void main(String[] args) {
		ArrayList<String> list = getMazePaths(0, 0, 2, 2);
		System.out.println(list);
	}

	public static ArrayList<String> getMazePaths(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		if (cr < er) {
			for (int i = 1; i <= er - cr; i++) {
				ArrayList<String> rrh = getMazePaths(cr + i, cc, er, ec);
				for (String rs : rrh) {
					mr.add("V" + i + rs);
				}
			}
		}
		if (cc < ec) {
			for (int j = 1; j <= ec - cc; j++) {
				ArrayList<String> rrv = getMazePaths(cr, cc + j, er, ec);
				for (String rs : rrv) {
					mr.add("H" + j + rs);
				}
			}
		}

		if (cc < ec && cr < er) {
			for (int i = 1; i <= er - cr; i++) {
				ArrayList<String> rrd = getMazePaths(cr + i, cc + i, er, ec);
				for (String rs : rrd) {
					mr.add("D" + i + rs);
				}

			}
		}

		return mr;

	}

}
