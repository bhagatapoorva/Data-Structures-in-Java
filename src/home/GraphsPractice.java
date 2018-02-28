package home;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class GraphsPractice {

	private class vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	HashMap<String, vertex> vces = new HashMap<>();

	public int numV() {
		return vces.size();
	}

	public boolean containsV(String vname) {
		return vces.containsKey(vname);
	}

	public void addV(String vname) {
		if (vces.containsKey(vname)) {
			return;
		}

		vertex vtx = new vertex();
		vces.put(vname, vtx);

	}

	public void removeV(String vname) {
		if (!vces.containsKey(vname)) {
			return;
		}

		vertex v = vces.get(vname);
		ArrayList<String> nbrss = new ArrayList<>(v.nbrs.keySet());

		for (String nbr : nbrss) {
			vertex n = vces.get(nbr);
			n.nbrs.remove(vname);
		}

		vces.remove(vname);
	}

	public int numE() {
		int sum = 0;

		ArrayList<String> vertices = new ArrayList<>(vces.keySet());

		for (String vrtx : vertices) {
			vertex vtx = vces.get(vrtx);

			ArrayList<String> nbrss = new ArrayList<>(vtx.nbrs.keySet());

			for (String nbr : nbrss) {
				sum += 1;
			}

		}

		return sum / 2;
	}
	
	public boolean containsE(String v1name, String v2name){
		vertex v1 = vces.get(v1name);
		vertex v2 = vces.get(v2name);
		
		if(v1 == null || v2 == null || v1.nbrs.containsKey(v2name) == false){
			return false;
		}
		
		return true;
		
	}
	
	public void addE(String v1name, String v2name, int size){
		vertex v1 = vces.get(v1name);
		vertex v2 = vces.get(v2name);
		
		if(v1 == null || v2 == null){
			return;
		}
		
		v1.nbrs.put(v2name, size);
		v2.nbrs.put(v1name, size);
	}
	
	public void removeE(String v1name, String v2name){
		vertex v1 = vces.get(v1name);
		vertex v2 = vces.get(v2name);
		
		if(v1 == null || v2 == null || v1.nbrs.containsKey(v2name) == false){
			return;
		}
		
		v1.nbrs.remove(v2name);
		v2.nbrs.remove(v1name);
	}
	
	public void display(){
		ArrayList<String> vertices = new ArrayList<>(vces.keySet());
		
		for(String vtx : vertices){
			vertex v = vces.get(vtx);
			String output = vtx + " => ";
			ArrayList<String> nbrss = new ArrayList<>(v.nbrs.keySet());
			
			for(String nbr : nbrss){
				output += nbr +", ";
			}
			
			System.out.println(output);
			
		}
		
	}

	public boolean hasPath(String v1name, String v2name){
		return hasPathHelper(v1name, v2name, new HashMap<>());
	}

	private boolean hasPathHelper(String v1name, String v2name, HashMap<String, Boolean> processed) {
		
		if(processed.containsKey(v1name) == true){
			return false;
		}
		
		processed.put(v1name, true);
		
		if(this.containsE(v1name, v2name) == true){
			return true;
		}
		
		vertex v1 = vces.get(v1name);
		ArrayList<String> nbrss = new ArrayList<>(v1.nbrs.keySet());
		
		for(String nbr : nbrss){
			if(hasPathHelper(nbr, v2name, processed) == true){
				return true;
			}
		}
		
		return false;
		
	}
	
	
}
