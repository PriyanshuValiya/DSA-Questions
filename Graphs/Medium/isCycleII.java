package Graphs.Medium;
import java.util.*;

public class isCycleII {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        
        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 4));
        
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 3));
    }

    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];

        for(int i=0; i < graph.length; i++) {
            if(!vis[i]) {
                if(isCycleUtil(graph, i, -1, vis)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[], int curr, int par, boolean vis[]) {
        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]) {
                if(isCycleUtil(graph, e.dest, curr, vis)) {
                    return true;
                }
            } else if(vis[e.dest] && e.dest != par) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(isCycle(graph));
    }  
}