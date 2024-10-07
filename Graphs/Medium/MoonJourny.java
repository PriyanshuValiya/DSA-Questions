package Graphs.Medium;
// https://www.hackerrank.com/challenges/journey-to-the-moon/problem

import java.util.*;

public class MoonJourny {
    static int n = 5;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void initialize() {
        for(int i = 0; i < n; i++) {
            par[i] = i; 
        }
    }

    public static int find(int x) { 
        if(x == par[x]) {
            return x;
        }

        return par[x] = find(par[x]); 
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if(rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static void main(String[] args) {
        initialize();
        int p = 5;
        int arr[][] = {{0, 1}, {2, 3}, {0, 4}};
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 1;

        for(int i=0; i < arr.length; i++) {
            union(arr[i][0], arr[i][1]);
        }

        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[0].length; j++) {
                if(arr[i][j] != find(arr[i][j])) {
                    map.put(find(arr[i][j]), map.getOrDefault(find(arr[i][j]), 1) + 1);
                }
            }
        }

        for(int n : map.keySet()) {
            res *= map.get(n);
        }

        System.out.println("Total Permutations : " + res);
    }
}