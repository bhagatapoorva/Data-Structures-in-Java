package recursion2;

public class ArrayMax {

	public static void main(String[] args) {
		int[] arr={11,54,766,89,100};
		System.out.println(max(arr,0));

	}
	public static int max(int[] arr,int vidx){
		if(vidx==arr.length-1){
			return arr[vidx];
		}
		
		int check=max(arr,vidx+1);
		if(check<arr[vidx]){
			check=arr[vidx];
		}
		
		  return check;
	}

}
