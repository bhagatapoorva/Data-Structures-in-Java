package TimeComplexity;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(edI("apoorva", "anshika"));
		System.out.println(edISW("apoorva","anshika"));
		System.out.println(ed("aditya", "aditi"));

	}

	public static int ed(String s1, String s2) {

		if (s1.length() == 0) {
			return s2.length();
		}
		if (s2.length() == 0) {
			return s1.length();
		}

		char ch1 = s1.charAt(0), ch2 = s2.charAt(0);
		String ros1 = s1.substring(1), ros2 = s2.substring(1);
		if (ch1 == ch2) {
			return ed(ros1, ros2);
		} else {
			int v1 = 1 + ed(s1, ros2); // deletion
			int v2 = 1 + ed(ros1, ros2); // replace
			int v3 = 1 + ed(ros1, s2); // insert

			return Math.min(v1, Math.min(v2, v3));
		}

	}

	public static int edI(String s1, String s2) {

		int[][] store = new int[s1.length() + 1][s2.length() + 1];
		int nv = 0;

		for (int i = s1.length() - 1; i >= 0; i--) {

			for (int j = s2.length() - 1; j >= 0; j--) {

				if (s1.charAt(i) == s2.charAt(j)) {
					nv = store[i + 1][j + 1];
				} else {
					nv = 1 + Math.min(store[i + 1][j], Math.min(store[i][j + 1], store[i + 1][j + 1]));

				}
				store[i][j] = nv;
			}
		}
		return store[0][0];
	}

	public static int edISW(String s1, String s2) {

		int[] store = new int[s2.length() + 1];
		int nv = 0, diag = 0;
		for (int i = s1.length() - 1; i >= 0; i--) {
			diag = 0;
			for (int j = s2.length() - 1; j >= 0; j--) {
				if (s1.charAt(i) == s2.charAt(j)) {
					nv = diag;
				} else {
					nv = 1 + Math.min(store[j], Math.min(store[j + 1], diag));

				}
				diag = store[j];
				store[j] = nv;
			}
		}
		return store[0];
	}
	
	public static String edValue(String s1, String s2){
		String[][] store = new String[s1.length()+1][s2.length()+1];
		
		int row = s1.length();
		for(int col = 0; col <= s2.length()-1; col++ ){
			store[row][col] = "" + s2.charAt(col);
		}
		
		int col = s2.length();
		for( row = 0; row<= s1.length()-1; row++){
			store[row][col] = "" + s1.charAt(row);
		}
		
		for(row = s1.length()-1; row>=0; row--){
			for(col = s2.length()-1; col>=0; col--){
				if(s1.charAt(row)==s2.charAt(col)){
					store[row][col] = s1.charAt(row) + store[row+1][col+1];
				} else{
					if(store[row+1][col+1].length()<store[row+1][col].length()&&store[row+1][col+1].length()<store[row][col+1].length()){
						store[row][col] = 
					}
				}
			}
		}
	}

}
