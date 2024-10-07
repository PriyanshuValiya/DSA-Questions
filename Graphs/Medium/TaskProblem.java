package Graphs.Medium;
import java.util.*;

public class TaskProblem {
    public static boolean isCycle(int tasks[][], int numTasks) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numTasks; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < tasks.length; i++) {
            adj.get(tasks[i][1]).add(tasks[i][0]);
        }

        boolean[] visited = new boolean[numTasks];
        boolean[] recStack = new boolean[numTasks];

        for (int i = 0; i < numTasks; i++) {
            if (isCycleUtil(i, adj, visited, recStack)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isCycleUtil(int v, List<List<Integer>> adj, boolean[] visited, boolean[] recStack) {
        if (recStack[v]) {
            return true; 
        }
        if (visited[v]) {
            return false;
        }

        visited[v] = true;
        recStack[v] = true;

        for (int neighbor : adj.get(v)) {
            if (isCycleUtil(neighbor, adj, visited, recStack)) {
                return true;
            }
        }

        recStack[v] = false;
        return false;
    }

    public static void main(String[] args) {
        int numTasks = 4;

        int tasks[][] = {
            {1, 0},
            {2, 1},
            {3, 2}
        };

        if (isCycle(tasks, numTasks)) {
            System.out.println("Not possible to finish all tasks");
        } else {
            System.out.println("Possible to finish all tasks");
        }
    }    
}
