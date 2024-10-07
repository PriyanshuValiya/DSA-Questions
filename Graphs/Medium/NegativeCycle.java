package Graphs.Medium;
// https://www.geeksforgeeks.org/problems/negative-weight-cycle3504/1

import java.util.*;

public class NegativeCycle {
    static class Edge {
        int src, dest, wgt;

        public Edge(int src, int dest, int wgt) {
            this.src = src;
            this.dest = dest;
            this.wgt = wgt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int edges[][]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edges.length; i++) {
            graph[edges[i][0]].add(new Edge(edges[i][0], edges[i][1], edges[i][2]));
        }
    }

    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, vis, i, -1)) {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[], boolean vis[], int curr, int par) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                if (isCycleUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }

            else if (vis[e.dest] && e.dest != par) {
                return true;
            }
        }

        return false;
    }

    public static boolean countNegativeEdges(int edges[][]) {
        for(int i=0; i < edges.length; i++) {
            if(edges[i][2] < 0) {
                return true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Edge> graph[] = new ArrayList[n];
        int edges[][] = { { 0, 1, -1 }, { 1, 2, -2 }, { 2, 0, -3 } };

        createGraph(graph, edges);

        if(isCycle(graph) && countNegativeEdges(edges)) {
            System.out.println("Negative Cycle Exist");
        } else {
            System.out.println("Non - Negative Cycle Exist");
        }
    }
}