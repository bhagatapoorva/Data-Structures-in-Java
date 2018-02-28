package RecursionAssignment6;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		System.out.println();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		boolean r = checksorted(arr, 1);
		System.out.println(r);
		
	}

	public static boolean checksorted(int[] arr, int vidx) {
		if (vidx == arr.length-1) {
			return true;
		}
		if (arr[vidx] < arr[vidx - 1]) {
			return false;
			
		}
			boolean check = checksorted(arr, vidx + 1);
		    return check;

	}

}
