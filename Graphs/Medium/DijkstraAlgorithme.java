package Graphs.Medium;
import java.util.*;

// For Finding shortest path beetween src node and target node.
// Note : It's doesn't work for negative weight edges.

public class DijkstraAlgorithme {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

/*
          1 --- 3
         /|     |\
        0 |     | 5 
         \|     |/
          2 --- 4
*/

    }

    static class Pair implements Comparable<Pair> {
        int node, path;

        public Pair(int node, int path) {
            this.node = node;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }
    }

    public static void dijkstra(ArrayList<Edge> graph[], int src) { 
        int dis[] = new int[graph.length];
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0; i < dis.length; i++) {
            if(i != src) {
                dis[i] = Integer.MAX_VALUE;
            }
        }

        pq.add(new Pair(0, 0));

        while(!pq.isEmpty()) {
            Pair curr = pq.remove();

            if(!vis[curr.node]) {
                vis[curr.node] = true;

                for(int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);

                    if(dis[e.src] + e.wt < dis[e.dest]) {
                        dis[e.dest] = dis[e.src] + e.wt;
                        pq.add(new Pair(e.dest, dis[e.dest]));
                    }
                }
            }
        }

        for(int n : dis) {
            System.out.print(n + " ");
        }
    }

    public static void main(String args[]) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        dijkstra(graph, 0);
    }
}