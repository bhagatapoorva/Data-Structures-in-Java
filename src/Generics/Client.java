package Generics;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[5];

		students[0] = new Student("ABC", 100, 1);
		students[1] = new Student("WOW", 60, 4);
		students[2] = new Student("HEY", 70, 3);
		students[3] = new Student("BYE", 80, 2);
		students[4] = new Student("YO", 50, 5);
		
		bubbleSort(students);
		display(students);
		
//		Integer[] arr = {23,55,76,43,12};
//		bubbleSort(arr);
//		display(arr);
//		
//		String[] s = {"hey", "bye", "hello", "tata"};
//		bubbleSort(s);
//		display(s);

		

	}

	public static <T> void display(T[] arr) {
		for (T val : arr) {
			System.out.print(val + ", ");
		}
		System.out.println(".");
	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {

		int count = 1;

		while (count <= arr.length - 1) {
			for (int i = 0; i < arr.length - count; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					
					// >0 indicates arr[i] is bigger value
					// <0 indicates smaller arr[i] is smaller value
					// ==0 means arr[i] = arr[i+1]
					
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			count++;
		}
	}

}
