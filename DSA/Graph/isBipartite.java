package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class isBipartite {

    // ek vertex rakhenge aur ek distance 
    // agar distance mismatch krta hai mtlb  odd length ka cycle 
    static class BipartitePair {
        int vrtx;
        int dis;

        public BipartitePair(int vrtx, int dis) {
            this.vrtx = vrtx;
            this.dis = dis;
        }
    }

    // bipartite meaning --- if it is possible to divide the vertices of graph in 2 independent subset  and on taking unioun we should get all of the vertices and on taking intersection fi(empty) should come

    // edges should across the set not within the set  i.e there should not be any edge within the same set 

    // application ==> coloring of graph 
    // I have red and black color I need to color the graph so that there is no same color at adjacent vertex

    // if graph is acyclic (connected or disconnected) is always a bipartite graph
    // all even length cycle is a bipartite graph  (edge ke respect mein )
    // all odd length cycle is never  a bipartite graph (edge ke respect mein )



    public static boolean isBipartite(int[][] graph) {

        HashMap<Integer, Integer> visited = new HashMap<>();
        Queue<BipartitePair> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) { // vertex
            if (visited.containsKey(i)) {
                continue;
            }
            q.add(new BipartitePair(i, 0));
            while (!q.isEmpty()) {
                // 1. remove
                BipartitePair pair = q.poll();

                // 2. ignore if already visited 
                if (visited.containsKey(pair.vrtx)) {
                    if (visited.get(pair.vrtx) != pair.dis) {
                            return false;
                    }
                    else{
                        continue;
                    }
                }
                // mark visited
                visited.put(pair.vrtx,pair.dis);
                // add unvisited neighbours
                for (int nbrs :graph[pair.vrtx]) {
                    if(!visited.containsKey(nbrs)){
                        q.add(new BipartitePair(nbrs,pair.dis+1));
                    }
                    
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] graph ={{1,2,3},{0,2},{0,1,3},{0,2}};
        // int[][] graph ={{1,3},{0,2},{1,3},{0,2}};
        System.out.println(isBipartite(graph));
    }
}
