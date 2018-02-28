package recursion2;

import java.util.Scanner;

public class displaylastindex {

	public static void main(String[] args) {
		int[] arr = { 11, 43, 56, 87, 65, 234, 56 , 87, 87};
		System.out.println("enter data to search");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(finddatalastindex(arr, arr.length-1, n));

	}
	
	public static int finddatalastindex(int[] arr,int vidx, int data){
		if(vidx==-1){
			return -1;
		}

		if(arr[vidx]==data){
			return vidx;
		} 
		int check= finddatalastindex(arr,vidx-1,data);
	    return check;
		
	}
}
