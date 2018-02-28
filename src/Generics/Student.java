package Generics;

import java.util.Comparator;

public class Student implements Comparable<Student> {

	private String name;
	private int marks;
	private int rank;
	public static final StudentMarksComparator MarksComparator = new StudentMarksComparator();
	public static final StudentRanksComparator RankComparator = new StudentRanksComparator();
	public static final StudentNameComparator NameComparator = new StudentNameComparator();

	public Student(String name, int marks, int rank) {
		this.name = name;
		this.marks = marks;
		this.rank = rank;
	}

	

	public int compareTo(Student o) {
		// ek baar mein ek he cheez can be compared
		return this.name.compareTo(o.name);
		// return o.rank - this.rank;
		// return this.marks - o.marks;
	}

	@Override
	public String toString() { // for value to be syso and not address
		String s = "[ " + name + " => " + marks + " " + rank + " ]";
		return s;
	}

	private static class StudentMarksComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.marks - o2.marks;
		}

	}

	private static class StudentRanksComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.rank - o2.rank;
		}

	}

	private static class StudentNameComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}

	}

}
