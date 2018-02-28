package TimeComplexity;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,45,1,67,87,43,23};
		int[] fr = mr(arr,arr.length-1,0);
		for(int i=0;i<fr.length;i++){
			System.out.println(fr[i]);
		}

	}
	public static int[] mr(int[] ques, int hi, int lo){
		if(lo==hi){
			int[] h = new int[1];
			h[0] = ques[lo];
			return h;
			
		}
		int mid = (hi+lo)/2;
		int[] fshalf = mr(ques,mid,lo);
		int[] sshalf = mr(ques,hi,mid+1);
		
		int[] sortedarray = sort(fshalf,sshalf);
		return sortedarray;
	}
	
	public static int[] sort(int[] one, int[] two){
		int i=0,j=0,k=0;
		int[] mrgsort = new int[one.length+two.length];
		while(i<one.length&&j<two.length){
			if(one[i]<two[j]){
				mrgsort[k]= one[i];
				k++;
				i++;
			} else{
				mrgsort[k]=two[j];
				j++;
				k++;
			}
		}
		while(i<one.length){
			mrgsort[k]=one[i];
			i++;
			k++;
		}
		while(j<two.length){
			mrgsort[k]=two[j];
			j++;
			k++;
		}
		return mrgsort;
	}
    
}
