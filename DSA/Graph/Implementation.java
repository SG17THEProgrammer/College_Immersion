package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Queue;

public class Implementation {
    // using hashMap
    HashMap<Integer, HashMap<Integer,Integer>> map;
    // constructor 
    public Implementation(int v){
        map = new HashMap<>();
        for (int i = 1; i <=v; i++) {
            map.put(i,new HashMap<>());
            
        }
        
    }

    public void AddEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
		map.get(v2).put(v1, cost);
	}

    public void addvertex(int v1) {
        map.put(v1, new HashMap<>());
    }

    public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);

	}
    public boolean Containsvertex(int v1) {
		return map.containsKey(v1);
	}
    public int noofEdge() {
		int sum = 0;
		for (int key : map.keySet()) {
			sum = sum + map.get(key).size();
		}
		return sum / 2;
	}

    public void removeEdge(int v1, int v2) {
		if (ContainsEdge(v1, v2)) {

			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}

	}

	public void removevertex(int v1) {
//  direct vertex remove nhi hogi ; pahale neighbours remove honge jinme wo vertex hai 
		for (int key : map.get(v1).keySet()) {
			// removeEdge(key, v1);
			map.get(key).remove(v1);
		}
		map.remove(v1);

	}


	public void desplay() {
		for (int key : map.keySet()) {
			System.out.println(key + "-->" + map.get(key));
		}
	}

    public boolean haspath(int src, int des, HashSet<Integer> visited) {

		if (src == des) {
			return true;
		}

		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = haspath(nbrs, des, visited);
				if (ans) {
					return ans;
				}
			}
		}
		visited.remove(src);
		return false;

	}

	public void printallpath(int src, int des, HashSet<Integer> visited, String ans) {

		if (src == des) {
			System.out.println(ans+src);
			return;
		}

		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				printallpath(nbrs, des, visited, ans + src + " ");

			}
		}
		visited.remove(src);

	}

	// BFS se we can detect if graph has cycle or not 
	// It gurantees the shortest path (in terms of edge )
	public boolean BFS(int src, int des) {
		Queue<Integer> q = new LinkedList<>(); //queue
		HashSet<Integer> visited = new HashSet<>();//cycle ho skta hai graph mein toh to keep track of it hashset le rhe 
		q.add(src);
		while (!q.isEmpty()) {
			// remove
			int r = q.remove();


			// Ignore if Already Visited
			if (visited.contains(r)) {
				continue;
			}


			// mark/add visited 
			visited.add(r);


			// self work(destination pe pahuch gye)
			if (r == des) {
				return true;
			}


			// nbrs add krna jo unvisited hai
			for (int nbrs : map.get(r).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}

		}
		return false;

	}


	// DFS se bhi we can detect if graph has cycle or not 
	public boolean DFS(int src, int des) {
		Stack<Integer> s = new Stack<>(); //stack
		HashSet<Integer> visited = new HashSet<>();
		s.push(src);
		while (!s.isEmpty()) {
			// remove
			int r = s.pop();
			// Ignore if Already Visited
			if (visited.contains(r)) {
				continue;
			}
			// mark/add visited 
			visited.add(r);
			// self work(destination pe pahuch gye)
			if (r == des) {
				return true;
			}
			// nbrs add krna jo unvisited hai
			for (int nbrs : map.get(r).keySet()) {
				if (!visited.contains(nbrs)) {
					s.push(nbrs);
				}
			}

		}
		return false;

	}


	// jitne components honge graph mein utni baar bfs chalega 
	//Traversal (breadth first traversal)
	public void BFT() {

		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			
			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int r = qq.remove();
				// Ignore if Already Visited
				if (visited.contains(r)) {
					continue;
				}
				// visited mark
				visited.add(r);
				// work
				System.out.print(r + " ");
				// nbrs add krna
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						qq.add(nbrs);
					}
				}

			}
			
		}

	}

	public void DFT() {

		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			st.push(src);
			while (!st.isEmpty()) {
				// remove
				int r = st.pop();
				// Ignore if Already Visited
				if (visited.contains(r)) {
					continue;
				}
				// visited mark
				visited.add(r);
				// work
				System.out.print(r + " ");
				// nbrs add krna
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}

			}
		}

	}



    public static void main(String[] args) {
            Implementation g = new Implementation(7);

		g.AddEdge(1, 4, 6);//1 and 4 ke beech edge with cost 6 
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		// g.desplay();
		// // System.out.println(g.noofEdge());
		// // //g.removeEdge(4, 5);
        // System.out.println("-------------------------------");
		// // g.removevertex(4);
		// g.addvertex(4);
		System.out.println(g.haspath(1, 6, new HashSet<>()));
		// g.printallpath(1,  6, new HashSet<>(), "");
    }
}
