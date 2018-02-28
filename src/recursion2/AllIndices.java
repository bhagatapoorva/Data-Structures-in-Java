package recursion2;

import java.util.ArrayList;
import java.util.Scanner;

public class AllIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		
		System.out.println("enter data to search");
		
		int m = scn.nextInt();
		ArrayList<Integer> allIndex = new ArrayList<>();
		allIndex = all(arr, 0,allIndex , m);
		System.out.println(allIndex);

	}
	
	public static ArrayList<Integer> all(int[] arr, int vidx, ArrayList<Integer> list,int data){
		if(vidx == arr.length){
			return list;
		}
		
		if(arr[vidx] == data){
			list.add(vidx);
		} 
		
		return all(arr, vidx+1, list, data);
	}

}
