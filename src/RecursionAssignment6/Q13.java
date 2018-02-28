package RecursionAssignment6;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int[] ainv = new int[arr.length];
		ainv=arrayinverse(arr, 0, ainv);
		for(int i=0;i<ainv.length;i++){
			System.out.println(ainv[i]);
		}

	}
// methord 1
	public static int[] arrayinverse(int[] arr, int vidx, int[] ainv) {
		if (vidx == arr.length) {
			return ainv;

		}
		int val=arr[vidx];
		ainv[val]=vidx;
		int[] a2=arrayinverse(arr,vidx+1,ainv);
		return a2;

	}
	
	// method 2(better)
	public static void inverse(int[] arr, int vidx){
		if(vidx==arr.length){
			return;
		}
		int temp = arr[vidx];
		 inverse(arr,vidx+1);
		 arr[temp]=vidx;
	}

}
