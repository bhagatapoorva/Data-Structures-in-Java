package june14;

import java.util.Scanner;

public class AdditionOfArrays {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr1 = takeinput();
		int[] arr2 = takeinput();

		System.out.println();
		display(arr1);
		System.out.println();
		display(arr2);
		System.out.println();
		sum(arr1, arr2);

	}

	public static int[] takeinput() {
		System.out.println("enter size");
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			int p = i + 1;
			System.out.println("enter value of " + p + " position");
			rv[i] = scn.nextInt();

		}
		return rv;

	}

	public static void display(int[] arr) {
		if(arr[0]!=0){
			System.out.print(arr[0]+" ");
		}
		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sum(int[] arr1, int[] arr2) {

		int count1 = arr1.length - 1, count2 = arr2.length - 1, p = 0, a = 0;
		if (count1 > count2) {
			p = count1 + 1;

		} else {
			p = count2 + 1;

		}
		int q = p + 1;
		int[] sum = new int[q];

		while (count1 >= 0 && count2 >= 0) {

			sum[p] = (a + (arr1[count1] + arr2[count2])) % 10;

			a = (arr1[count1] + arr2[count2]) / 10;
			count1--;
			count2--;
			p--;
		}

		while (count1 >= 0) {
			sum[p] = ((a + arr1[count1]) % 10);

			a = (a + arr1[count1]) / 10;
			count1--;
			p--;

		}
		while (count2 >= 0) {
			sum[p] = ((a + arr2[count2]) % 10);

			a = (a + arr2[count2]) / 10;
			count2--;
			p--;
		}
		
			sum[p] = a;
		
		System.out.println();
		display(sum);

	}
}
