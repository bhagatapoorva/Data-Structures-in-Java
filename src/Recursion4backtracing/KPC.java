package Recursion4backtracing;

public class KPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kpc("12","");

	}
	public static void kpc(String ques, String ans){
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		String s = getcode(ch);
		String roq = ques.substring(1);
		
		for(int i=0;i<s.length();i++){
			
			kpc(roq,ans+s.charAt(i));
		}
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
}
