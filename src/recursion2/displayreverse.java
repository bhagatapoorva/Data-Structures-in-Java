package recursion2;

public class displayreverse {

	public static void main(String[] args) {
		int[] arr={11,22,33,44,55};
		displayrev(arr,0);
	}
	public static void displayrev(int[] arr, int vidx){
		if(vidx==arr.length){
			return;
		}
		displayrev(arr,vidx+1);
		System.out.println(arr[vidx]);
		
		
	}

}
