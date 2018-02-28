package Recursion4backtracing;

public class printTargetSS {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		target(arr,0,"",12);

	}

	public static void target(int[] ques, int vidx, String ans, int target) {
		if (vidx == ques.length) {
			if (target == 0) {
				System.out.println(ans);
			}
			return;
		}
		
		target(ques, vidx+1, ans, target);
		target(ques, vidx+1, ans+"\t"+ques[vidx], target - ques[vidx]);

	}

}
