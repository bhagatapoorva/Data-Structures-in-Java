package Recursion4backtracing;

public class PrintSplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		// printSplitArray(arr, 0, 0, 0, "", "");
		splitarray(arr, 0, "", 0, "", 0);

	}

	public static void splitarray(int[] ques, int vidx, String s1, int sum1, String s2, int sum2) {
		if (vidx == ques.length) {
			if (sum1 == sum2) {
				System.out.println("(" + s1 + ")" + " and " + "(" + s2 + ")");

			}
			return;
		}
		splitarray(ques, vidx + 1, s1 +" "+ ques[vidx], sum1 + ques[vidx], s2, sum2);
		splitarray(ques, vidx + 1, s1, sum1, s2 +" " + ques[vidx], sum2 + ques[vidx]);
	}

	public static void printSplitArray(int[] arr, int vidx, int sg1, int sg2, String g1, String g2) {
		if (vidx == arr.length) {
			if (sg1 == sg2) {
				System.out.println(g1 + " and " + g2);
			}
			return;
		}

		printSplitArray(arr, vidx + 1, sg1, sg2, g1, g2);
		printSplitArray(arr, vidx + 1, sg1 + arr[vidx], sg2, g1 + arr[vidx], g2);
		printSplitArray(arr, vidx + 1, sg1, sg2 + arr[vidx], g1, g2  + arr[vidx]);
	}

}
