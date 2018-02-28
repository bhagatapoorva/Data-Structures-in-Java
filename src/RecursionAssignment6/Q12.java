package RecursionAssignment6;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n= scn.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
	   int[] arev =	new int[arr.length];
			arev=   arrayreverse(arr, 0, arev, arr.length-1);
			for(int i=0;i<arev.length;i++){
				System.out.println(arev[i]);
			}

	}
	public static int[] arrayreverse(int[] arr, int vidx1,int[] arev, int vidx2){
		if(vidx1==arr.length){
			return arev;
		}
		arev[vidx2]=arr[vidx1];
		arrayreverse(arr,vidx1+1,arev,vidx2-1);
		return arev;
		
		
		
	}

}
