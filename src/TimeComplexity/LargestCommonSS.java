package TimeComplexity;

public class LargestCommonSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lcsI("adgef", "aegef"));
		System.out.println(lcsISW("abefg","aefdg"));
		System.out.println(lcs("abefg", "aefdg"));

	}

	public static int lcs(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		char ch1 = s1.charAt(0), ch2 = s2.charAt(0);
		String roq1 = s1.substring(1), roq2 = s2.substring(1);
		if (ch1 == ch2) {
			return 1 + lcs(roq1, roq2);
		} else {
			int v1 = lcs(s1, roq2);
			int v2 = lcs(roq1, s2);

			if (v2 > v1) {
				return v2;
			} else {
				return v1;
			}

		}

	}

	public static int lcsI(String s1, String s2) {
		int[][] cmp = new int[s1.length() + 1][s2.length() + 1];
		for (int i = s1.length() - 1; i >= 0; i--) {
			for (int j = s2.length() - 1; j >= 0; j--) {
				if (s1.charAt(i) == s2.charAt(j)) {
					cmp[i][j] = 1 + cmp[i + 1][j + 1];
				} else {
					cmp[i][j] = Math.max(cmp[i][j + 1], cmp[i + 1][j]);
				}
			}
		}
		return cmp[0][0];
	}

	public static int lcsISW(String s1, String s2){  //check
		int[] cmp = new int[s2.length()+1];
		int nv = 0, diag = 0;
		for(int i = s1.length()-1; i >=0; i--){
			 diag = 0;
			for(int j = s2.length()-1; j>=0;j--){
				if(s1.charAt(i)==s2.charAt(j)){
					nv = 1+diag;
				} else{
					nv = Math.max(cmp[j], cmp[j+1]);
				}
				diag = cmp[j];
				cmp[j]=nv;
			}
		}
		return cmp[0];
	}
	
	
}
