package recursion2;

public class IsPallindrome {

	public static void main(String[] args) {
		int[] arr1={11,22,33,33,22,11};
		int[] arr2={11,2,33,44,56};
		boolean check1=ispallindrome(arr1,0,arr1.length-1);
		boolean check2=ispallindrome(arr2,0,arr2.length-1);
		System.out.println(check1+" "+check2);

	}
	public static boolean ispallindrome(int[] arr, int left,int right){
		if(left>=right){
			return true;
		}
		if(arr[left]!=arr[right]){
			return false;
		}
		boolean check=ispallindrome(arr,left+1,right-1);
		return check;
	}

}
