package june12;

import java.util.Scanner;

public class ArrayCheckInverse {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = takeinput();
		int check[] = takeinput();
		System.out.println("\n");
		display(arr);
		System.out.println("\n");
		display(check);
		System.out.println("\n");
		 System.out.println(inverse(arr,check));
		

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
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static boolean inverse(int[] arr, int[] check) {
		int[] arr2 = new int[arr.length];
				
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			arr2[temp] = i;
		}
		
                for(int i=0;i<arr.length;i++){
                	if(arr2[i]!=check[i]){
                		return false;
                	}
                }
                return true;

	}

}
