package june12;

import java.util.Scanner;

public class arrayReverse {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] arr = takeinput();
		display(arr);
		reverse(arr);
		System.out.println("\n");
		display(arr);

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
	
	public static void display(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void reverse(int[] arr){
		int left=0, right= arr.length-1;
		while(left<=right){
			int temp= arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left+=1;
			right-=1;
		}
			
		
	}
	

}
