package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Graph_Valid_Tree_261 {

    public static boolean BFT(HashMap<Integer,List<Integer>> map) {

		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count = 0;
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			count++;
			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int r = qq.remove();
				// Ignore if Already Visited
				if (visited.contains(r)) {
					return false;
				}
				// visited mark
				visited.add(r);
				

				// nbrs add krna
				for (int nbrs : map.get(r)) {
					if (!visited.contains(nbrs)) {
						qq.add(nbrs);
					}
				}

			}
			
		}
        return count==1;
	}

    public static boolean validTree (int n , int [][]edges){

		// graph banaya hai given input se 
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }
        return BFT(map);

    }
    public static void main(String[] args) {
		int n = 5;
		int [] []edges = {{0,1}, {0,2}, {0,3}, {1,4}};
		// int [] []edges = {{0,1}, {1,2}, {2,3}, {1,3}, {1,4}};
		System.out.print(validTree(n,edges));
    }
}
