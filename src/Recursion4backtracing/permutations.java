package Recursion4backtracing;

public class permutations {

	public static void main(String[] args) {
		getPermutations("aabc", "");

	}

	public static void getPermutations(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = '\0';
		String roq = null;
		boolean[] arr = new boolean[256];
		for (int i = 0; i < ques.length(); i++) {
			ch = ques.charAt(i);
			roq = ques.substring(0, i) + ques.substring(i + 1);
			if (arr[ch] == false) {
				
				getPermutations(roq, ans + ch);
				arr[ch]=true;
			}
		}

	}

}
