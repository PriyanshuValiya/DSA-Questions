// https://www.geeksforgeeks.org/introduction-and-approximate-solution-for-vertex-cover-problem
// Not Completed.

package Graphs.Medium;
import java.util.*;

public class VertexCover {
    static class Edge {
        int src, dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 6));
    }

    public static void vertexCover(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                for (int j = 0; j < graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    if(!vis[e.dest]) {
                        vis[e.src] = true;
                        vis[e.dest] = true;
                    }
                }
            }
        }

        for (int i = 0; i < vis.length && vis[i]; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[7];
        createGraph(graph);
        vertexCover(graph);
    }
}