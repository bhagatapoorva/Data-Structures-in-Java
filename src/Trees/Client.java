package Trees;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10 3 20 2 50 0 60 0 30 3 70 2 110 0 120 0 80 0 90 2 140 0 150 0 40 1 100 0 
		// 10 2 20 2 50 0 60 0 30 2 70 0 80 0
		GenericTree gtr = new GenericTree();
		GenericTree gt2 = new GenericTree();
		gtr.display();
		System.out.println();
		gt2.display();
		System.out.println();
		System.out.println(gtr.isIso(gt2));
//		gtr.levelOrderZigzag();
//		System.out.println(gtr.size());
//		System.out.println(gtr.isEmpty());
//		System.out.println(gtr.size2());
//		System.out.println(gtr.max());
//		System.out.println(gtr.height());
//		System.out.println(gtr.find(110));
//		System.out.println(gtr.find(140));;
//        gtr.mirror();
//        System.out.println();
//        gtr.display();
//		gtr.preOrder();
//		System.out.println();
//		gtr.postOrder();
//		gtr.printAtDeapth(3);
//		gtr.levelOrder();
//		gtr.levelOrderLineWise();
//		gtr.multiSolver(10);
//		System.out.println(gtr.kthSmallest(4));
//		gtr.removeLeaves();
//		gtr.linearize();
//		System.out.println("----------------------------------------");
//		gtr.display();
		
		
		int[] post = {12, 37, 25, 62, 87, 75, 50};
		int[] in = {12, 25, 37, 50, 62, 75, 87};
//		BinaryTree bt = new BinaryTree();
//		BinaryTree g = new BinaryTree();
		// 50 true 25 true 12 false false true 37 true 30 false false true 51 false false true 75 true 62 false false true 87 false false
		// 50 true 25 true 12 false false false true 30 false true 40 false true 60 false false
		// 60 true 50 true 40 true 35 false false false false true 70 true 55 false false true 80 false false
//		
//		bt.display();
//		System.out.println();
//		
//	
//		System.out.println();
//		bt.largestPathSumToTarget(185);
//		bt.removeAllLeaves();
//		bt.isBST();
//		System.out.println();
//		bt.display();
//		System.out.println(bt.size2());
//		System.out.println(bt.find(75));
//		System.out.println(bt.max());
//		System.out.println(bt.height());
//		System.out.println(bt.diameter2());
//		System.out.println(bt.diameter());
//		System.out.println(bt.isBalanced());
//		System.out.println(bt.isBST());
//		bt.preOrder();
//		bt.postOrder();
//		bt.inOrder();
//		bt.levelOrder();
//		bt.preOrderI();
//		bt.preOrderItr();
	//	bt.postOrderItr();
//		bt.inOrderItr();
//		bt.printWithoutSiblings();
	}

}
