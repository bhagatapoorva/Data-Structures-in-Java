package home;

import java.util.Scanner;

public class ZeroAtTheEndOfArray {

	public static void main(String[] args) {
		System.out.println("enter size");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
			System.out.println("enter element at "+i+" index");
			arr[i]=scn.nextInt();
		}
		int counter=1;
		while(counter<=arr.length-1){
			for(int i=counter;i>0;i--){
				if(arr[i-1]==0){
					swap(arr,i-1,i);
				} else{
					break;
				}
			}
			counter++;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
        
	}
	public static void swap(int[] arr,int i, int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
