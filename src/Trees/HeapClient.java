package Trees;

public class HeapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Heap rankList = new Heap(true);
		
//		rankList.add(200);
//		rankList.add(700);
//		rankList.add(600);
//		rankList.add(100);
//		rankList.add(300);
//		rankList.add(900);
//		rankList.add(500);
//		
//		rankList.display();
//		
//		while(rankList.size()!=0){
//			System.out.println(rankList.removeHP());
//	}
		int[] arr = {10,20,5,18,9,17,6,27,4};
		Heap rankList = new Heap(arr, true);
		rankList.display();
		while(rankList.size()!=0){
			System.out.println(rankList.removeHP());
	}
		
		
		

	}

}
