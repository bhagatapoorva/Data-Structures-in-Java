package Generics;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericHeap<T> {

	private ArrayList<T> data = new ArrayList<>();
	private Comparator<T> ctor; // imp. no ismin, but comparator only

	public GenericHeap(Comparator<T> ctor) {
		this.ctor = ctor;
	}

	private boolean isLarger(int i, int j) { // to know if rank list needed or marks

		T ith = data.get(i);
		T jth = data.get(j);

		return ctor.compare(ith,jth) > 0;
	}

	private void swap(int i, int j) {
		T ith = data.get(i);
		T jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);
	}

	public int size() {
		return data.size();
	}

	public boolean isEmpty() {
		return data.isEmpty();
	}

	public T getHP() {
		return data.get(0);
	}

	public void display() {
		System.out.println(data);
	}

	public void add(T value) {
		data.add(value);
		upheapify(data.size() - 1);

	}

	private void upheapify(int ci) {
		if (ci == 0) {
			return;
		}

		int pi = (ci - 1) / 2;

		if (isLarger(ci, pi)) {
			swap(ci, pi);
			upheapify(pi);
		}
	}

	public T removeHP() {
		swap(0, data.size() - 1);
		T rv = data.remove(data.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		int maxi = pi;

		if (lci < data.size() && isLarger(lci, maxi)) {
			maxi = lci; // '<' condition to make sure that lci and rci exist
		}
		if (rci < data.size() && isLarger(rci, maxi)) {
			maxi = rci;
		}

		if (maxi != pi) {
			swap(maxi, pi);
			downheapify(maxi);
		}

	}

}

