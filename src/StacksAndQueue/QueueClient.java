package StacksAndQueue;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		queue q1 = new queue();
//		queue q = new DynamicQueue();

		 q1.enqueue(10);
		 q1.display();

		 q1.enqueue(20);
		 q1.display();

		 q1.enqueue(30);
		 q1.display();

		 q1.enqueue(40);
		 q1.display();

		 q1.dequeue();
		 q1.display();

		 q1.dequeue();
		 q1.display();

		 q1.enqueue(50);
		 q1.display();

		// System.out.println(q1.front());
		// q1.display();

		 q1.enqueue(60);
		 q1.display();

		// System.out.println(q1.size());
		// q1.display();

		 q1.enqueue(70);
		 q1.display();
		 
		 q1.dequeue();
		 q1.display();
		 
		 q1.queueReverseUsingRecursion();
		 q1.display();
		 
//		 ActualReverse(q1);
//		 q1.display();

		// q1.enqueue(80);
		// q1.display();
		// ReverseQueue(q1, q1.front, 0);
		// q1.display();
		//
		// q1.dequeue();
		// q1.display();

		// q1.dequeue();
		// q1.display();

		// System.out.println(q1.isEmpty());
		//
		// q1.dequeue();
		// q1.display();
		//
		// q1.dequeue();
		// q1.display();
		//
		// q1.dequeue();
		// q1.display();
		//
		// System.out.println(q1.isEmpty());

		// System.out.println(q1.front());
		// q1.dequeue();
		// q1.display();

//		q.enqueue(10);
//		q.enqueue(20);
//		q.enqueue(30);
//		q.enqueue(40);
//		q.display();
//		q.dequeue();
//		q.display();
//		q.enqueue(50);
//		q.display();
//		System.out.println();
//		ReverseQueue(q, q.front);
//		q.display();
//		ActualReverse(q);
//		q.display();
		// q.dequeue();
		// q.display();
		// ReverseQueue(q, q.front,0);
//		
//		StackAdapterQueueB q3 = new StackAdapterQueueB();
//		q3.enqueue(10);
//		q3.display();
//		q3.enqueue(20);
//		q3.enqueue(30);
//		q3.enqueue(40);
//	     q3.display();
////	     System.out.println("\n"+q3.front());
//		q3.dequeue();
//		System.out.println();
//		q3.display();
//		System.out.println();
//		q3.enqueue(50);
//		q3.display();
	
		
//		System.out.println("\n"+q3.front());
//		StackAdapterQueueA qu = new StackAdapterQueueA();
//		qu.enqueue(100);
//		qu.enqueue(200);
//		qu.enqueue(300);
//		qu.enqueue(400);
//		qu.display();
		
//		qu.dequeue();
//		qu.display();
		

	}

	public static void ReverseQueue(queue q, int si) {
		if (si == q.size || si == q.front - 1) {
			return;
		}
		ReverseQueue(q, (si + 1) % q.data.length);
		System.out.print(q.data[si] + ", ");
	}

	public static void ActualReverse(queue q) throws Exception {
		if (q.isEmpty() == true) {
			return;
		}

		int val = q.dequeue();
		ActualReverse(q);
		q.enqueue(val);

	}

}
