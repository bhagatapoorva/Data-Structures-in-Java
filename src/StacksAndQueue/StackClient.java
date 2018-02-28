package StacksAndQueue;

public class StackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// stack s1 = new Dynamicstack();
		//
		// s1.push(10);
		// s1.display();
		// System.out.println("---------------------");
		//
		// s1.push(20);
		// s1.display();
		// System.out.println("---------------------");
		//
		// s1.push(30);
		// s1.display();
		// System.out.println("---------------------");
		//
		// s1.push(40);
		// s1.display();
		// System.out.println("---------------------");
		//
		//
		// s1.push(50);
		// s1.display();
		// System.out.println("---------------------");
		//
		// s1.push(10);
		// s1.display();
		//// System.out.println("---------------------"); will give exception
		//
		//
		// System.out.println(s1.top());
		// s1.display();
		// System.out.println("---------------------");
		//
		// System.out.println(s1.pop());
		// s1.display();
		// System.out.println("---------------------");
		//
		// System.out.println(s1.size());
		//
		// s1.push(10);
		// s1.display();
		// System.out.println("---------------------");
		//
		// ReverseStack(s1, s1.tos);
		//
		//
		// }
		//
		// public static void ReverseStack(stack s, int si){
		// if(si==-1){
		// return;
		// }
		// ReverseStack(s, si-1);
		// System.out.print(s.data[si]+", ");
		// }
		//
		
		stack s2 = new MinStack();
		s2.push(4);
		s2.push(5);
		s2.push(3);
		s2.push(7);
		s2.push(2);
		s2.push(2);
		s2.push(10);
		s2.push(0);
		s2.display();
		
		System.out.println(s2.getMin());
		s2.pop();
		s2.pop();
		s2.pop();
		s2.display();
		System.out.println(s2.getMin());
	}
}
