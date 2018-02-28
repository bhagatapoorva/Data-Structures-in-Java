package Generics;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericHeapCliet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericHeap<Student> heap = new GenericHeap<>(Student.MarksComparator);

		Student[] students = new Student[7];

		// make students
		students[0] = new Student("ABC", 100, 1);
		students[1] = new Student("WOW", 60, 4);
		students[2] = new Student("HEY", 70, 3);
		students[3] = new Student("BYE", 90, 2);
		students[4] = new Student("YO", 40, 5);
		students[5] = new Student("TATA", 20, 6);
		students[6] = new Student("MODI", 10, 7);

		// add students in a heap
		heap.add(students[0]);
		heap.add(students[1]);
		heap.add(students[2]);
		heap.add(students[3]);
		heap.add(students[4]);
		heap.add(students[5]);
		heap.add(students[6]);

		heap.display();
		while (!heap.isEmpty()) {
			System.out.println(heap.removeHP());
		}
	}

	private static class Sort implements Comparator<Integer> {

		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2 - o1;
		}

	}

	public static ArrayList<Integer> mergeKSortedArrayLists(ArrayList<ArrayList<Integer>> lists) {

		GenericHeap<Integer> heap = new GenericHeap<>();

		for (ArrayList<Integer> list : lists) {

		}

	}

}
