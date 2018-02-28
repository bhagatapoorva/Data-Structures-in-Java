package assignments;

import java.util.ArrayList;

public class assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// q9(1,1000);
//		System.out.println(toweroOfHanoi(3, 'A', 'B', 'C'));
		int[] arr = {1,2,3,4,5,6,7};
//		System.out.println(q6b(arr, 0, "", 0, "" ,0));
		System.out.println(q7b(arr, 0, 7, ""));

	}

	public static void q9(int current, int max) {

		System.out.println(current);

		int c = current * 10;

		for (int i = c; i < c + 10; i++) {
			if (i <= max) {
				q9(i, max);
			}
		}

		if (current <= 9) {
			q9(current + 1, max);
		}

	}

	public static int toweroOfHanoi(int numOfDisc, char begin, char end, char help) {

		if (numOfDisc == 0) {
			return 0;
		}
		int nm1 = toweroOfHanoi(numOfDisc - 1, begin, help, end);
		System.out.println(" MOVE DISC " + numOfDisc + " from " + begin + " to " + end);
		int n = toweroOfHanoi(numOfDisc - 1, help, end, begin);
		return nm1 + n + 1;
	}

	public static ArrayList<String> q6b(int[] arr, int vidx, String s1, int sum1, String s2, int sum2) {

		if (vidx == arr.length) {
			ArrayList<String> br = new ArrayList<String>();
			
			if (sum1 == sum2) {
				br.add(s1 + " and " + s2);
			}
			return br;
			
		}
		
		ArrayList<String> res1 = q6b(arr, vidx+1, s1+arr[vidx], sum1+arr[vidx], s2, sum2);
		ArrayList<String> res2 = q6b(arr, vidx+1, s1, sum1, s2+arr[vidx], sum2+arr[vidx]);
//		ArrayList<String> res3 = q6b(arr,vidx+1, s1, sum1, s2, sum2);
		
		ArrayList<String> mr = new ArrayList<>();
		mr.addAll(res1);
		mr.addAll(res2);
//		mr.addAll(res3);
		
		return mr;
	}
	
	public static ArrayList<String> q7b(int[] arr, int vidx, int target, String s){   //ArrayList<Intger> 
		if(vidx == arr.length){
			ArrayList<String> br = new ArrayList<>();
			
			if(target == 0){
				
				br.add(s);
			}
			return br;
		}
		
		ArrayList<String> res1 = q7b(arr,vidx+1, target-arr[vidx], s+arr[vidx]);
		ArrayList<String> res2 = q7b(arr, vidx+1, target, s);
		
		ArrayList<String> mr = new ArrayList<>();
		mr.addAll(res1);
		mr.addAll(res2);
		
		return mr;
	}
}
