package Recursion4backtracing;

public class Subsequences3 {

	public static void main(String[] args) {
		printSS("abc","");

	}
	public static void printSS(String ques, String ans){
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		
		
		printSS(roq,ans+"");
		printSS(roq,ans+ch);
		printSS(roq,ans+(int)ch);
	}

}
