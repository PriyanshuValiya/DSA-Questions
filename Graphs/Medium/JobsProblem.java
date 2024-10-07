package Graphs.Medium;
// https://www.geeksforgeeks.org/minimum-time-taken-by-each-job-to-be-completed-given-by-a-directed-acyclic-graph
// Not Completed

import java.util.*;

public class JobsProblem {
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

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 4));
        graph[1].add(new Edge(1, 5));

        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 9));

        graph[3].add(new Edge(3, 6));

        graph[4].add(new Edge(4, 6));
        graph[4].add(new Edge(4, 8));

        graph[5].add(new Edge(5, 8));

        graph[6].add(new Edge(6, 7));

        graph[7].add(new Edge(7, 8));

        graph[8].add(new Edge(8, 10));
    }

    public static void calcInDeg(ArrayList<Edge> graph[], int inDeg[]) {
        for(int i = 0; i < graph.length; i++) {
            for(int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                inDeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        int inDeg[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();

        calcInDeg(graph, inDeg);

        for(int i = 1; i < inDeg.length; i++) {
            if(inDeg[i] == 0) {
                q.add(i);
            }
        }

        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);

                inDeg[e.dest]--;

                if(inDeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 11;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        topSort(graph);
    }
}