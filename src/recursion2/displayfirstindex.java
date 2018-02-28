package recursion2;

import java.util.Scanner;

public class displayfirstindex {

	public static void main(String[] args) {
		int[] arr = { 11, 43, 56, 87, 65, 234, 56 , 87, 87};
		System.out.println("enter data to search");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(finddatafirstindex(arr, 0, n));

	}

	public static int finddatafirstindex(int[] arr, int vidx, int data) {
		if(vidx==arr.length){
			return -1;
		}

		if(arr[vidx]==data){
			return vidx;
		} 
		int check= finddatafirstindex(arr,vidx+1,data);
	    return check;
	}
}
