package june12;

import java.util.Scanner;

public class ArrayMirrorInverse {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	
		int[] arr = takeinput();
		display(arr);
		System.out.println("\n");
		 System.out.println(inverse(arr));
	}
	public static int[] takeinput() {
		System.out.println("enter size");
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			System.out.println("enter value of " + i + "th position");
			rv[i] = scn.nextInt();

		}
		return rv;

	}

	public static boolean inverse(int[] arr) {
		int[] arr2 = new int[arr.length];
				
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			arr2[temp] = i;
		}
		display(arr2);
		System.out.println();
		display(arr);
		System.out.println();
                for(int i=0;i<arr.length;i++){
                	if(arr[i]!=arr2[i]){
                		return false;
                	}
                }
                return true;

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}


