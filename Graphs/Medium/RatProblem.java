// https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

package Graphs.Medium;
import java.util.*;

public class RatProblem {
    static class Info {
        int x, y;
        String dir;

        public Info(int x, int y, String dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }
    }

    public static void moveForward(int mat[][], int startIdx[], int targetIdx[]) {
        Queue<Info> q = new LinkedList<>();
        boolean vis[][] = new boolean[mat.length][mat[0].length];

        int dx[] = {0, 1};
        int dy[] = {1, 0};
        char dir[] = {'R', 'D'};

        q.add(new Info(startIdx[0], startIdx[1], ""));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (curr.x == targetIdx[0] && curr.y == targetIdx[1]) {
                System.out.println("Shortest Path : " + curr.dir);
                return;
            }

            for (int i = 0; i < 2; i++) {
                int x = curr.x + dx[i];
                int y = curr.y + dy[i];

                if(isSafe(x, y, mat) && mat[x][y] == 1 && !vis[x][y]) { 
                    q.add(new Info(x, y, curr.dir + dir[i]));
                    vis[x][y] = true;
                }
            }
        }
    }

    public static boolean isSafe(int x, int y, int mat[][]) {
        return (x >= 0 && x < mat.length && y >= 0 && y < mat[0].length);
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        int startIdx[] = {0, 0};
        int targetIdx[] = {3, 3};  

        moveForward(mat, startIdx, targetIdx);
    }  
}
