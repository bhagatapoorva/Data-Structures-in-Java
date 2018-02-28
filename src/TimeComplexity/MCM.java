package TimeComplexity;

public class MCM {

	private static final int Interger = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dims = { 10, 20, 30, 40, 50, 60 };
		int[][] store = new int[dims.length][dims.length];
		System.out.println(mcmDP(dims, 0, dims.length - 1, store));
		System.out.println(mcm(dims, 0, dims.length - 1));

	}

	public static int mcm(int[] dims, int starti, int endi) {
		if (endi - starti == 1) {
			return 0;
		}

		int min = Integer.MAX_VALUE;

		for (int i = starti + 1; i < endi; i++) {
			int val1 = mcm(dims, starti, i);
			int val2 = mcm(dims, i, endi);
			int realcost = dims[starti] * dims[endi] * dims[i];
			int totalcost = val1 + val2 + realcost;

			if (totalcost < min) {
				min = totalcost;
			}
		}
		return min;
	}

	public static int mcmDP(int[] dims, int si, int ei, int[][] store) {
		if (si+1 == ei ) {
			return 0;
		}

		if (store[si][ei] != 0) {
			return store[si][ei];
		}

		int min = Integer.MAX_VALUE;
		for (int i = si + 1; i < ei; i++) {
			int val1 = mcmDP(dims, si, i,store);
			int val2 = mcmDP(dims, i, ei,store);
			int realcost = dims[si] * dims[ei] * dims[i];
			int totalcost = val1 + val2 + realcost;

			if (totalcost < min) {
				min = totalcost;
			}
		}
		store[si][ei] = min;
		return min;

	}

}
