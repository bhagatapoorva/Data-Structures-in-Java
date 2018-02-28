package Recursion3;

import java.util.ArrayList;

public class boardpaths {

	public static void main(String[] args) {
		ArrayList<String> list = getBoardPaths(1,4);
		System.out.println(list.size());

	}
	
	public static ArrayList<String> getBoardPaths(int curr, int end){
		
		if(curr==end){
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if(curr>end){
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		
		ArrayList<String> mr = new ArrayList<>();
		 for(int dice=1;dice<=6;dice++){
			 ArrayList<String> rr=  getBoardPaths(curr+dice,end);
			 for(String rs:rr){
				 mr.add(dice+rs);
			 }
		 }
		 return mr;
	}

}
