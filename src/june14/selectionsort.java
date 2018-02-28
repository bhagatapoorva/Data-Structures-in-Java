package june14;

import java.util.Scanner;

public class selectionsort {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = takeinput();
		display(arr);
		selectionSort(arr);
		System.out.println("\n");
		display(arr);

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
	public static void swap(int[] arr,int i, int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void selectionSort(int[] arr){
		int counter=1;
		while(counter<=arr.length-1){
			for(int i=counter;i<arr.length;i++){
				if(arr[counter-1]>arr[i]){
					swap(arr,i,counter-1);
				}
			}
			
			counter++;
		}
		
		
	}
    

}
