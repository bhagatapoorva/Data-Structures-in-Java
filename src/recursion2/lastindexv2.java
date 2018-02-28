package recursion2;

import java.util.Scanner;

public class lastindexv2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		int data = scn.nextInt();
		int li=lastindex(arr,0,data);
		System.out.println(li); 

	}
	public static int lastindex(int[] arr, int vidx, int data){
		if(vidx==arr.length){
			return -1;
		}
		int check = lastindex(arr,vidx+1,data);
		if(arr[vidx]==data){
			if(check==-1){ // important varna first index he aa jayega
				return vidx;
			}
		}
		
		return check;
		
		
	}
	
	

}
