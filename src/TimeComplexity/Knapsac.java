package TimeComplexity;

public class Knapsac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weight = { 20, 15, 15, 5, 18 };
		int[] price = { 10, 15, 20, 5, 8 };
		System.out.println(knapsac(weight, price, 0, 50));

	}

	public static int knapsac(int[] weight, int[] price, int vidx, int capacity) {

		if (vidx == weight.length) {
			return 0;
		}
		int v1 = 0, v2 = 0;

		if (capacity >= weight[vidx]) {
			v1 = price[vidx]+ knapsac(weight, price, vidx + 1, capacity - weight[vidx]);
		}
		
		v2 = knapsac(weight,price,vidx+1,capacity);
		return Math.max(v1, v2);
	}

}
