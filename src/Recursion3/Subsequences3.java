package Recursion3;

import java.util.ArrayList;

public class Subsequences3 {

	private static Object abcd;

	public static void main(String[] args) {
		String one = "abc";
		ArrayList mr = getSubsequences(one);
        System.out.println(mr);
	}
	
	public static ArrayList<String> getSubsequences(String str){
		if(str.length()==0){
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
	}
		char ch = str.charAt(0);
		int a = (int)ch;
		String ros = str.substring(1);
		
		ArrayList<String> rr = getSubsequences(ros);
		ArrayList<String> mr = new ArrayList<>();
		
		for(String rs: rr){
			mr.add(rs);                // nahi aunga
			mr.add(ch+rs);             // main aunga
			mr.add(a+rs);              // mera ASCII ayega
		}
		return mr;
		
	}
}
