package RecursionAssignment6;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		bubblesort(arr, 0, 0);
	}

	public static void bubblesort(int[] arr, int vidx1, int vidx2) {
		if (vidx1 == arr.length-1) {
			
			return;
		}

		if (vidx2 == arr.length - vidx1-1) {
			
			bubblesort(arr, vidx1 + 1, 0);
		   {
			System.out.println(arr[vidx2]+"\t");
			}
			return;

		}
		if(arr[vidx2]>arr[vidx2+1]){
			int temp = arr[vidx2];
			arr[vidx2]=arr[vidx2+1];
			arr[vidx2+1]=temp;
					
		}
		bubblesort(arr,vidx1,vidx2+1);
		

	}

}
