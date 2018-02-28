package Recursion4backtracing;

public class DictionaryOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dictionarygreater("aab", "", "aab");
		dictionarysmaller("aacb","","aacb");

	}

	public static void dictionarygreater(String ques, String ans, String store) {
		if (ques.length() == 0) {

			for (int i = 0; i < store.length(); i++) {
				if (store.charAt(i) < ans.charAt(i)) {
					System.out.println(ans);
					break;
				} else if (store.charAt(i) == ans.charAt(i)) {
					continue;

				} else {
					break;
				}

			}

			return;
		}
		boolean[] arr = new boolean[256];
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			
			if (arr[ch] == false) {
				dictionarygreater(roq, ans + ch, store);
				arr[ch] = true;
			}
		}
	}

	
	public static void dictionarysmaller(String ques, String ans, String store) {
		
		if (ques.length() == 0) {

			for (int i = 0; i < store.length(); i++) {
				if (store.charAt(i) > ans.charAt(i)) {
					System.out.println(ans);
					break;
				} else if (store.charAt(i) == ans.charAt(i)) {
					continue;

				} else {
					break;
				}

			}

			return;
		}
		boolean[] arr = new boolean[256];
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			
			if (arr[ch] == false) {
				dictionarysmaller(roq, ans + ch, store);
				arr[ch] = true;
			}
		}
	}
	
}


