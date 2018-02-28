package Recursion3;

import java.util.ArrayList;

public class subsequences2 {

	public static void main(String[] args) {
		String str = "acbd";
		ArrayList<String> mr= getsub(str);
		System.out.println(mr);

	}
	public static ArrayList<String> getsub(String str){
		if(str.length()==0){
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		 char ch = str.charAt(0);
		 int a = (int)ch;
		 String ros = str.substring(1);
		 
		 ArrayList<String> rr = getsub(ros);
		 ArrayList<String> mr = new ArrayList<>();
		 
		 
		for(String rs : rr){
			 mr.add(rs);
			 mr.add(ch+rs);
		 }
		return mr;
	}

}
