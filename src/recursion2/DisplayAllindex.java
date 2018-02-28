package recursion2;

import java.util.Scanner;

public class DisplayAllindex {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		
		System.out.println("enter data to search");
		
		int m = scn.nextInt();
		int[] rr = (finddataallindex(arr, 0, m,0));
		display(rr,0);
		

	}

	public static int[] finddataallindex(int[] arr, int vidx, int data, int csf) {
		
		if (vidx == arr.length) {
			
			return new int[csf];
		}
		int[] rr=null;
		if (arr[vidx] == data) {
			
			rr=finddataallindex(arr,vidx+1,data,csf+1);
			rr[csf]=vidx;

		}
		else{
		rr=finddataallindex(arr,vidx+1,data,csf);
		}
		return rr;
		

	}
	public static void  display(int[] arr, int vidx){
		if(vidx==arr.length){
			return;
		}
		System.out.println(arr[vidx]);
		display(arr,vidx+1);
		
		
		
	}

}
