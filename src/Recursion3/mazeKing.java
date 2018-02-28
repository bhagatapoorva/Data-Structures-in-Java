package Recursion3;

import java.util.ArrayList;

public class mazeKing {

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
        
		if(cr>er||cc>ec){
			ArrayList<String> br = new ArrayList<>();
			return br;
			
		}
		ArrayList<String> mr = new ArrayList<>();

		
			ArrayList<String> rrv = getMazePaths(cr + 1, cc, er, ec);
			for (String rs : rrv) {
				mr.add("v" + rs);
			}

		

		
			ArrayList<String> rrh = getMazePaths(cr, cc + 1, er, ec);
			for (String rs : rrh) {
				mr.add("h" + rs);
			}
			ArrayList<String> rrd = getMazePaths(cr+1, cc + 1, er, ec);
			for (String rs : rrd) {
				mr.add("d" + rs);
			}
		

		return mr;

	}

}
