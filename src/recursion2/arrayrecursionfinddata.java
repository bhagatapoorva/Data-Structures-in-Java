package recursion2;

import java.util.Scanner;

public class arrayrecursionfinddata {

	public static void main(String[] args) {
		int[] arr = { 11, 43, 56, 87, 65, 234 };
		System.out.println("enter data to search");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(finddata(arr, 0, n));
	}

	public static boolean finddata(int[] arr, int vidx, int data){
		if(vidx==arr.length){
			return false;
		}
			if(arr[vidx]==data){
				return true;
			} 
				boolean check= finddata(arr,vidx+1,data);
			    return check;
			
			
		
		
		
	}
	
}
