// https://practice.geeksforgeeks.org/problems/steps-by-knight5927/1

package Graphs.Medium;
import java.util.*;

public class KnightMoves {
    static class Info {
        int x, y, step;

        public Info(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    public static void minStepToReachTarget(int KnightPos[], int targetPos[], int N) {
        Queue<Info> q = new LinkedList<>();
        boolean vis[][] = new boolean[N][N];

        int dx[] = {1, 2, 2, 1, -2, -1, -2, -1};
        int dy[] = {2, 1, -1, -2, -1, -2, 1, 2};

        q.add(new Info(KnightPos[0], KnightPos[1], 0));

        while(!q.isEmpty()) {
            Info currPos = q.remove();

            if(currPos.x == targetPos[0] && currPos.y == targetPos[1]) {
                System.out.println("Minimum Step : " + currPos.step);
            }

            for(int i=0; i < 8; i++) {
                int x = currPos.x + dx[i];
                int y = currPos.y + dy[i];

                if(isSafe(x, y, N) && !vis[x][y]) {
                    q.add(new Info(x, y, currPos.step+1));
                    vis[x][y] = true;
                }
            }
        }
    }

    public static boolean isSafe(int x, int y, int n) {
        return (x < n && y < n && x > 0 && y > 0);
    }

    public static void main(String[] args) {
        int N = 6;
        int KnightPos[] = {4, 5};
        int targetPos[] = {1, 1};

        minStepToReachTarget(KnightPos, targetPos, N);
    }    
}