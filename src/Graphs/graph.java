package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class graph {
	private class vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	private HashMap<String, vertex> vces = new HashMap<>();

	public int numVertices() {
		return vces.size();
	}

	public boolean constainsVertex(String vname) {
		return vces.containsKey(vname);
	}

	public void addVertex(String vname) {
		if (this.constainsVertex(vname)) {
			return;
		}

		vertex newvtrx = new vertex();
		vces.put(vname, newvtrx);
	}

	public void removeVertex(String vname) {
		if (!this.constainsVertex(vname)) {
			return;
		}

		vertex vtx = vces.get(vname);
		ArrayList<String> nbrnames = new ArrayList<>(vtx.nbrs.keySet());

		for (String nbrname : nbrnames) {
			vertex vtxnbr = vces.get(nbrname);
			vtxnbr.nbrs.remove(vname);
		}

		vces.remove(vname);

	}

	public int numEdges() {
		int sum = 0;

		ArrayList<String> vertices = new ArrayList<>(vces.keySet());

		for (String vtx : vertices) {
			vertex v = vces.get(vtx);
			sum += v.nbrs.size();
		}

		return sum / 2;
	}

	public boolean constainsEdge(String v1name, String v2name) { // are neighbors
		vertex v1 = vces.get(v1name);
		vertex v2 = vces.get(v2name);

		if (v1 == null || v2 == null || v1.nbrs.containsKey(v2name) == false) {
			return false;
		}

		return true;
	}

	public void addEdge(String v1name, String v2name, int weight) {
		vertex v1 = vces.get(v1name);
		vertex v2 = vces.get(v2name);

		if (v1 == null || v2 == null) {
			return;
		}

		v1.nbrs.put(v2name, weight);
		v2.nbrs.put(v1name, weight);
	}

	public void removeEdge(String v1name, String v2name) {
		vertex v1 = vces.get(v1name);
		vertex v2 = vces.get(v2name);

		if (v1 == null || v2 == null || v1.nbrs.containsKey(v2name) == false) {
			return;
		}

		v1.nbrs.remove(v2name);
		v2.nbrs.remove(v1name);
	}

	public void display() {
		ArrayList<String> vnames = new ArrayList<>(vces.keySet());

		for (String vname : vnames) {
			String str = vname + " => ";
			vertex vtx = vces.get(vname);

			ArrayList<String> nbrnames = new ArrayList<>(vtx.nbrs.keySet());
			for (String nbrname : nbrnames) {
				str += nbrname + " [ " + vtx.nbrs.get(nbrname) + " ], ";
			}

			System.out.println(str + ".");
		}
	}

	public boolean hasPath(String v1name, String v2name) {
		return hasPathHelper(v1name, v2name, new HashMap<>());
	}

	private boolean hasPathHelper(String v1name, String v2name, HashMap<String, Boolean> processed) {

		if (processed.containsKey(v1name) == true) {
			return false;
		}

		processed.put(v1name, true);

		if (this.constainsEdge(v1name, v2name) == true) {
			return true;
		}

		vertex vtx = vces.get(v1name);
		ArrayList<String> nbrnames = new ArrayList<>(vtx.nbrs.keySet());

		for (String nbrname : nbrnames) {
			if (hasPathHelper(nbrname, v2name, processed) == true) {
				return true;
			}
		}

		return false;
	}

	public boolean bfs(String v1name, String v2name) {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<>();

		Pair rootPair = new Pair(v1name, vces.get(v1name), v1name);
		queue.addLast(rootPair);

		while (queue.size() != 0) {
			// 1. remove first
			Pair rp = queue.removeFirst();

			// 2. CHECK IF PROCESSED, MARK IF NOT
			if (processed.containsKey(rp.vname)) {
				continue;
			}
			processed.put(rp.vname, true);

			// 3. CHECK IT THERE IS AN EDGE
			System.out.println(rp.vname + " via " + rp.psf);
			if (this.constainsEdge(rp.vname, v2name) == true) {
				return true;
			}

			// 4. ADD NEIGHBOURS TO QUEUE
			ArrayList<String> nbrnames = new ArrayList<>(rp.vtx.nbrs.keySet());
			for (String nbrname : nbrnames) {
				if (!processed.containsKey(nbrname)) {
					Pair np = new Pair(nbrname, vces.get(nbrname), rp.psf + nbrname);
					queue.addLast(np);
				}
			}
		}
		return false;
	}

	public boolean dfs(String v1name, String v2name) {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> stack = new LinkedList<>();

		Pair rootPair = new Pair(v1name, vces.get(v1name), v1name);
		stack.addFirst(rootPair);

		while (stack.size() != 0) {
			// 1. remove first
			Pair rp = stack.removeFirst();

			// 2. CHECK IF PROCESSED, MARK IF NOT
			if (processed.containsKey(rp.vname)) {
				continue;
			}
			processed.put(rp.vname, true);

			// 3. CHECK IT THERE IS AN EDGE
			System.out.println(rp.vname + " via " + rp.psf);
			if (this.constainsEdge(rp.vname, v2name) == true) {
				return true;
			}

			// 4. ADD NEIGHBOURS TO QUEUE
			ArrayList<String> nbrnames = new ArrayList<>(rp.vtx.nbrs.keySet());
			for (String nbrname : nbrnames) {
				if (!processed.containsKey(nbrname)) {
					Pair np = new Pair(nbrname, vces.get(nbrname), rp.psf + nbrname);
					stack.addFirst(np);
				}
			}
		}
		return false;
	}

	public void bft() {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<>();

		ArrayList<String> vnames = new ArrayList<>(vces.keySet());

		for (String vname : vnames) {
			if (processed.containsKey(vname)) {
				continue;
			}

			Pair rootPair = new Pair(vname, vces.get(vname), vname);
			queue.addLast(rootPair);
			while (queue.size() != 0) {
				// 1. remove first
				Pair rp = queue.removeFirst();

				// 2. CHECK IF PROCESSED, MARK IF NOT
				if (processed.containsKey(rp.vname)) {
					continue;
				}
				processed.put(rp.vname, true);

				// 3. CHECK IT THERE IS AN EDGE
				System.out.println(rp.vname + " via " + rp.psf);

				// 4. ADD NEIGHBOURS TO QUEUE
				ArrayList<String> nbrnames = new ArrayList<>(rp.vtx.nbrs.keySet());
				for (String nbrname : nbrnames) {
					if (!processed.containsKey(nbrname)) {
						Pair np = new Pair(nbrname, vces.get(nbrname), rp.psf + nbrname);
						queue.addLast(np);
					}
				}
			}
		}

	}

	public void dft() {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> stack = new LinkedList<>();

		ArrayList<String> vnames = new ArrayList<>(vces.keySet());

		for (String vname : vnames) {
			if (processed.containsKey(vname)) {
				continue;
			}

			Pair rootPair = new Pair(vname, vces.get(vname), vname);
			stack.addFirst(rootPair);
			while (stack.size() != 0) {
				// 1. remove first
				Pair rp = stack.removeFirst();

				// 2. CHECK IF PROCESSED, MARK IF NOT
				if (processed.containsKey(rp.vname)) {
					continue;
				}
				processed.put(rp.vname, true);

				// 3. CHECK IT THERE IS AN EDGE
				System.out.println(rp.vname + " via " + rp.psf);

				// 4. ADD NEIGHBOURS TO QUEUE
				ArrayList<String> nbrnames = new ArrayList<>(rp.vtx.nbrs.keySet());
				for (String nbrname : nbrnames) {
					if (!processed.containsKey(nbrname)) {
						Pair np = new Pair(nbrname, vces.get(nbrname), rp.psf + nbrname);
						stack.addFirst(np);
					}
				}
			}
		}

	}

	private class Pair {
		String vname;
		vertex vtx;
		String psf;

		Pair(String vname, vertex vtx, String psf) {
			this.vname = vname;
			this.vtx = vtx;
			this.psf = psf;
		}
	}

	public boolean IsConnected() {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<>();
		int counter = 0;

		ArrayList<String> vnames = new ArrayList<>(vces.keySet());

		for (String vname : vnames) {
			if (processed.containsKey(vname)) {
				continue;
			}

			counter++;
			Pair rootPair = new Pair(vname, vces.get(vname), vname);
			queue.addLast(rootPair);
			while (queue.size() != 0) {
				// 1. remove first
				Pair rp = queue.removeFirst();

				// 2. CHECK IF PROCESSED, MARK IF NOT
				if (processed.containsKey(rp.vname)) {
					continue;
				}
				processed.put(rp.vname, true);

				// 3. CHECK IT THERE IS AN EDGE
				System.out.println(rp.vname + " via " + rp.psf);

				// 4. ADD NEIGHBOURS TO QUEUE
				ArrayList<String> nbrnames = new ArrayList<>(rp.vtx.nbrs.keySet());
				for (String nbrname : nbrnames) {
					if (!processed.containsKey(nbrname)) {
						Pair np = new Pair(nbrname, vces.get(nbrname), rp.psf + nbrname);
						queue.addLast(np);
					}
				}
			}
		}
		return counter == 1;
	}

	public boolean IsCyclic() {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<>();

		ArrayList<String> vnames = new ArrayList<>(vces.keySet());

		for (String vname : vnames) {
			if (processed.containsKey(vname)) {
				continue;
			}

			Pair rootPair = new Pair(vname, vces.get(vname), vname);
			queue.addLast(rootPair);
			while (queue.size() != 0) {
				// 1. remove first
				Pair rp = queue.removeFirst();
				
				System.out.println(rp.vname + " via " + rp.psf);

				// 2. CHECK IF PROCESSED, MARK IF NOT
				if (processed.containsKey(rp.vname)) {
					
					return true;
				}
				processed.put(rp.vname, true);

				// 4. ADD NEIGHBOURS TO QUEUE
				ArrayList<String> nbrnames = new ArrayList<>(rp.vtx.nbrs.keySet());
				for (String nbrname : nbrnames) {
					if (!processed.containsKey(nbrname)) {
						Pair np = new Pair(nbrname, vces.get(nbrname), rp.psf + nbrname);
						queue.addLast(np);
					}
				}
			}
		}
		return false;
	}
	
	public boolean IsTree(){
		return this.IsConnected() && !this.IsCyclic();
	}

}
