// https://www.geeksforgeeks.org/gold-mine-problem

import java.util.*;

public class Goldmine {
    public static void goldmine(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        int dp[][] = new int[n][m];
        int firstIdx = 0;
        int maxGold = 0;

        for (int i = 0; i < m; i++) {
            if (mat[0][i] > mat[0][firstIdx]) {
                firstIdx = i;
            }
        }

        dp[0][firstIdx] = mat[0][firstIdx];

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                if (dp[i][j] != 0) {
                    if (j > 0) {
                        dp[i + 1][j - 1] = Math.max(dp[i + 1][j - 1], mat[i + 1][j - 1] + dp[i][j]);
                    }

                    dp[i + 1][j] = Math.max(dp[i + 1][j], mat[i + 1][j] + dp[i][j]);
                    
                    if (j < m - 1) {
                        dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], mat[i + 1][j + 1] + dp[i][j]);
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        for (int i = 0; i < n; i++) {
            maxGold = Math.max(maxGold, dp[m - 1][i]);
        }

        System.out.println("\nMaximum Gold : " + maxGold);
    }

    public static void main(String[] args) {
        int mat[][] = {
                { 1, 2, 5, 0 },
                { 3, 2, 0, 6 },
                { 1, 4, 2, 1 },
                { 5, 1, 3, 2 }
        };

        goldmine(mat);
    }
}
