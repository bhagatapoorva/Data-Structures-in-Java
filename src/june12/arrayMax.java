package june12;

public class arrayMax {

	public static void main(String[] args) {
		int[] arr={10,20,30,40,60,50};
		System.out.println("max number is "+arrmax(arr));

	}

	public static int arrmax(int[] arr) {
		int max=arr[0],i=0;
		for(i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			
		}
		return max;
		
		
	}

}
