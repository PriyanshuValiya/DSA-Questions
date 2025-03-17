import java.util.*;

public class EnclavesNumber {
    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int dx[] = { 0, 1, 0, -1 };
    int dy[] = { 1, 0, -1, 0 };

    public static boolean isSafe(int x, int y, int grid[][]) {
        return (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length);
    }

    public int numEnclaves(int[][] grid) {
        Queue<Pair> q = new LinkedList<Pair>();
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 || j == 0 || i == grid.length - 1 || j == grid[0].length - 1) {
                    if (grid[i][j] == 1) {
                        q.add(new Pair(i, j));
                        vis[i][j] = true;
                    }
                }
            }
        }

        while (!q.isEmpty()) {
            int x = q.peek().x;
            int y = q.peek().y;
            q.remove();

            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (isSafe(newX, newY, grid) && !vis[newX][newY] && grid[newX][newY] == 1) {
                    q.add(new Pair(newX, newY));
                    vis[newX][newY] = true;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int grid[][] = { { 0, 0, 0, 0 }, { 1, 0, 1, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 0 } };

        EnclavesNumber en = new EnclavesNumber();
        System.out.println(en.numEnclaves(grid));
    }
}