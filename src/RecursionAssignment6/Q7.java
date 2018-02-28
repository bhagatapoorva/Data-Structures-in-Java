package RecursionAssignment6;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		int m=scn.nextInt();
		boolean r=linaersearch(arr,0,m);
        System.out.println(r);
	}
	public static boolean linaersearch(int[] arr, int vidx, int data){
		if(vidx==arr.length){
			return false;
		}
		if(arr[vidx]==data){
			return true;
		}
		boolean check=linaersearch(arr,vidx+1,data);
		return check;
		
	}
	

}
