package StacksAndQueue;

public class LLclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList(); // reference(list) and instance of linked list class
//		LinkedList l1 = new LinkedList();
		
		list.AddLast(10); 
		list.AddLast(20);
		list.AddLast(30);
		list.AddLast(40);
		list.AddLast(50);
		list.AddLast(60);
		list.AddLast(70);
		list.display();
//		list.Aq1(0, 1);
		list.Aq10();
		System.out.println();
		list.display();
		System.out.println(list.getLast());
//		
	}

}
