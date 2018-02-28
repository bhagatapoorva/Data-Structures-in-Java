package Graphs;

public class GraphClient {

	public static void main(String[] args) {
		graph g = new graph();
		
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
		g.addVertex("G");
		
		g.addEdge("A", "B", 10);
		g.addEdge("A", "D", 40);
		g.addEdge("B", "C", 10);
		g.addEdge("C", "D", 10);
		g.addEdge("D", "E", 2);
		g.addEdge("E", "F", 3);
		g.addEdge("E", "G", 8);
		g.addEdge("F", "G", 3);
		
		g.display();
//		System.out.println(g.hasPath("A", "G"));
//		g.removeEdge("D", "G");
//		g.removeVertex("C");
//		g.display();
//		System.out.println(g.hasPath("A", "G"));
//		System.out.println(g.bfs("A", "G"));
//		System.out.println(g.dfs("A", "G"));
//		g.bft();
//		System.out.println("---------------------------------------");
//		g.dft();
//		System.out.println(g.IsConnected());
//		System.out.println(g.IsCyclic());
//        System.out.println(g.IsTree());
	}

}
