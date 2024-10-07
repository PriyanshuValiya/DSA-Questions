package Graphs.Medium;
// https://www.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1
// Not Completed

import java.util.*;

public class FloydWarshall {
    static class Edge {
        int src, dest, wgt;

        public Edge(int src, int dest, int wgt) {
            this.src = src;
            this.dest = dest;
            this.wgt = wgt;
        }
    }

    public static void createGraph(int edges[][], ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edges.length; i++) {
            // System.out.print(edges[i][0] + " " + edges[i][1] + " " + edges[i][2] + " | ");
            // graph[edges[i][0]].add(new Edge(edges[i][0], edges[i][1], edges[i][2]));
        }
    }

    public static void shortestPath(ArrayList<Edge> graph[], int src, int edges[][]) {
        int dist[] = new int[graph.length];

        for(int i=0; i < dist.length; i++) {
            dist[i] = edges[i][2];
        }

        // for(int i=0; i < graph.length; i++) {
        //     for(int j=0; j < graph[i].size(); j++) {
        //         Edge e = graph[i].get(j);

        //         int u = e.src;
        //         int v = e.dest;
        //         int wt = e.wgt;

        //         if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
        //             dist[v] = dist[u] + wt;

        //         }
        //     }
        // }

        for(int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static void main(String[] args) {
        int edges[][] = { { 0, 1, 43 }, { 1, 0, 6 }, { -1, -1, 0 } };
        ArrayList<Edge> graph[] = new ArrayList[3];
        createGraph(edges, graph);

        shortestPath(graph, edges[0][0], edges);
    }
}