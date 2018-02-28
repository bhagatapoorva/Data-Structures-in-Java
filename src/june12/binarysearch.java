package june12;

import java.util.Scanner;

public class binarysearch {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = takeinput();
		System.out.println("enter number to search");
		int num = scn.nextInt();
		System.out.println("the number is found at" + binarysearch(arr, num) + " position");

	}

	public static int[] takeinput() {
		System.out.println("enter size");
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			int p=i+1;
			System.out.println("enter value of " + p + " position");
			rv[i] = scn.nextInt();

		}
		return rv;

	}
	public static int binarysearch(int[] arr, int n) {
		int lo = 0, hi=arr.length-1;
		while(lo<=hi){
			int mid=(lo+hi)/2;
			if(n==arr[mid]){
				return mid+1;
			} else if(n>arr[mid]){
				lo=mid+1;
				
			}
			else{
				hi=mid-1;
			}
		}
		return -1;

	}

	

}
