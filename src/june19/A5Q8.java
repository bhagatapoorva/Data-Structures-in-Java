package june19;

import java.util.Scanner;

public class A5Q8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.println(maxfrequency(s));
	}
	public static char maxfrequency(String s){
		int[] arr=new int[256];
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			arr[ch]++;
			
			
		}
		int max=0;
		int maxidx=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
				maxidx=i;
			}
			
			
		}
		char ch=(char)maxidx;
					
		return ch;
	}

}
