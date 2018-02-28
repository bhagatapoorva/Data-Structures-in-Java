package Trees;

public class BSTclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] sa = {12,25,37,50,62,75,87};
		int[] sa = {10, 20, 30, 50, 60,70,80};
		BST bst = new BST(sa);
		bst.display();
		System.out.println();
		bst.printInRange(20, 60);
//		System.out.println();
//		bst.replaceWithSumOfLarger();
//		bst.removeUsingTernaryOperator(50);
//		bst.display();

	}

}
