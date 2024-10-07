// https://www.geeksforgeeks.org/graph-coloring-applications/#:~:text=Graph%20coloring%20problem%20is%20to,are%20colored%20using%20same%20color

import java.util.*;

public class ColourGraph {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }

    public static boolean isBipartite(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        int color[] = new int[graph.length];

        Arrays.fill(color, -1);

        for(int i=0; i < graph.length; i++) {
            if(color[i] == -1) {
                q.add(i);
                color[i] = 0;

                while(!q.isEmpty()) {
                    int curr = q.remove();

                    for(int j=0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);

                        if(color[e.dest] == -1) {
                            color[e.dest] = color[curr] == 0 ? 1 : 0;
                            q.add(e.dest); 
                        }

                        if(color[curr] == color[e.dest]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        if(isBipartite(graph)) {
            System.out.println("Minimum Colours : 2");
        } else {
            System.out.println("Minimum Colours : 3");
        }
    }
}