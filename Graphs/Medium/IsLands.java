// https://www.geeksforgeeks.org/problems/find-the-number-of-islands/1

package Graphs.Medium;

public class IsLands {
    public static int numIslands(int grid[][]) {
        int numIslands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    numIslands++;
                    dfs(grid, i, j);
                }
            }
        }

        return numIslands;
    }

    public static void dfs(int grid[][], int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return;
        }

        grid[i][j] = 0;

        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j - 1);
        dfs(grid, i + 1, j + 1);
        dfs(grid, i - 1, j + 1);
        dfs(grid, i + 1, j - 1);
    }

    public static void main(String[] args) {
        int grid[][] = {{ 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 1, 0 }};

        System.out.println("Number Of Islands : " + numIslands(grid));
    }
}
