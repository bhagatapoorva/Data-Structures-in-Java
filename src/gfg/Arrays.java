package gfg;

import java.awt.geom.RoundRectangle2D;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Arrays {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// q1();
		// uniquePair();
		// smallestToMakeEven();
		// balanceArray();
		// fightingTheDarkness();
		// findIndex();
		// seconfLargestElement();
		// minAndMax();
		// smallAndSecondSmall();
		// rotateByOne();
		// segregate0and1();
		// kCatterpilars();
//		mostFrequentWordInArrayOfStrings();
		mostFrequentWordInArrayOfStrings();

	}

	public static void q1() {
		System.out.println("Enter number of test cases");
		int tc = scn.nextInt();

		for (int i = 0; i < tc; i++) {
			System.out.println("Enter the size of the array");
			int n = scn.nextInt();

			int[] a = new int[n];
			int sum = 0;

			for (int j = 0; j < n; j++) {
				a[j] = scn.nextInt();
				sum += a[j];
			}

			for (int j = 0; j < n; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
			float avg = ((float) sum) / 3;

			avg = avg * 100;
			int newavg = (int) avg;
			float ans = ((float) newavg / 100);

			// float f = 125.0f;
			DecimalFormat form = new DecimalFormat("0.00");

			System.out.println(sum + " " + form.format(ans));

		}
	}

	public static void uniquePair() {

		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			int[] check = new int[10];
			for (int j = 0; j < n; j++) {
				arr[j] = scn.nextInt();
				check[arr[j]] += 1;
			}
			for (int k = 0; k < 9; k++) {
				if (check[k] == 1) {
					System.out.print(k + " ");
				}
			}
			System.out.println();
		}
	}

	public static void smallestToMakeEven() {

		int t = scn.nextInt();

		while (t > 0) {

			int n = scn.nextInt();
			int[] arr = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
				sum += arr[i];
			}

			if (sum % 2 == 0) {
				System.out.println(2);
			} else {
				System.out.println(1);
			}

			t--;

		}
	}

	public static void balanceArray() {
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int sum1 = 0, sum2 = 0;
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
				if (i < n / 2) {
					sum1 += arr[i];
				} else if (i == n / 2) {
					if (n % 2 != 0) {
						sum2 += 0;
					} else {
						sum2 += arr[i];
					}
				} else {
					sum2 += arr[i];
				}

			}

			if (sum2 > sum1) {
				System.out.println(sum2 - sum1);
			} else {
				System.out.println(sum1 - sum2);
			}

		}
	}

	public static void fightingTheDarkness() {
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			int max = 0;
			for (int i = 0; i < n; i++) {

				arr[i] = scn.nextInt();
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			System.out.println(max);
			t--;
		}

	}

	public static void findIndex() {
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			int left = 0, right = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			int find = scn.nextInt();
			for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
				if (left == 0) {
					if (arr[i] == find) {
						left = i;
					}
				}
				if (right == 0) {
					if (arr[j] == find) {
						right = j;
					}
				}

			}
			System.out.println(left + " " + right);

			t--;
		}
	}

	public static void seconfLargestElement() {
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}

			int max = arr[0], secondmax = 0;

			for (int i = 1; i < n; i++) {
				if (arr[i] > max) {
					secondmax = max;
					max = arr[i];
				} else if (arr[i] < max && arr[i] > secondmax) {
					secondmax = arr[i];
				}

			}
			System.out.println(secondmax);

			t--;
		}
	}

	public static void minAndMax() {
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
				if (arr[i] < min) {
					min = arr[i];
				}

				if (arr[i] > max) {
					max = arr[i];
				}

			}
			System.out.println(min + " " + max);
			t--;
		}

	}

	public static void smallAndSecondSmall() {
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}

			int min = arr[0], secondmin = Integer.MAX_VALUE;
			for (int i = 1; i < n; i++) {
				if (arr[i] < secondmin && arr[i] < min) {
					secondmin = min;
					min = arr[i];
				} else if (arr[i] < secondmin && arr[i] > min) {
					secondmin = arr[i];
				}
			}

			if (secondmin == Integer.MAX_VALUE) {
				System.out.println(-1);
			} else {
				System.out.println(min + " " + secondmin);
			}

			t--;
		}
	}

	public static void rotateByOne() {
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			int temp = arr[n - 1];
			for (int i = n - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = temp;
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			t--;
			System.out.println();
		}
	}

	public static void segregate0and1() {
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			int zero = 0, one = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
				if (arr[i] == 0) {
					zero++;
				} else {
					one++;
				}
			}
			for (int i = 0; i < zero; i++) {
				arr[i] = 0;
				System.out.print(arr[i] + " ");
			}
			for (int j = zero; j < zero + one; j++) {
				arr[j] = 1;
				System.out.print(arr[j] + " ");

			}
			System.out.println();
			t--;
		}
	}

	public static void kCatterpilars() {
		int t = scn.nextInt();
		while (t > 0) {
			int count = 0;
			int n = scn.nextInt();
			int k = scn.nextInt();
			int[] a = new int[n];
			int[] arr = new int[k];
			for (int i = 0; i < k; i++) {
				arr[i] = scn.nextInt();
				for (int j = 1; j <= n; j += arr[i]) {
					if (a[j - 1] == 1) {

					} else {
						count++;
						a[j - 1] = 1;
					}
				}
			}
			System.out.println(n - count);
			t--;
		}
	}

	public static void mostFrequentWordInArrayOfStrings() {
		int t = scn.nextInt();
		String word = "NULL";
		while (t > 0) {
			int n = scn.nextInt();
			String[] words = new String[n];
			int[] check = new int[n];
			for (int i = 0; i < n; i++) {
				words[i] = scn.next();
			}

			int max = 0;
			for (int i = 0; i < n; i++) {
				if (check[i] == 0) {
					int count = 1;
					for (int j = i + 1; j < n; j++) {
						if (check[j] == 0) {
							if (words[i].compareTo(words[j]) == 0) {
								count++;
								check[j] = 1;
							}
						}
					}
					check[i] = count;
					if (count >= max) {
						if (count > max) {
							max = count;
							word = words[i];
						} else if (count == max) {
							if(word.compareTo(words[i]) > 0){
								word = words[i];
							}

						}
					}
				}
			}
			System.out.println(word);

			t--;
		}
	}

}
