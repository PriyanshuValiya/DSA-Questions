/// https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

import java.util.*;

public class Knapsack01 {
    public static int knapsack(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) {
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1, dp);
            int ans2 = knapsack(val, wt, W, n - 1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            dp[n][W] = knapsack(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    public static void main(String[] args) {
        int W = 4;
        int val[] = {1, 2, 3};
        int wt[] = {4, 5, 1};
        int dp[][] = new int[val.length + 1][W + 1];
        
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(knapsack(val, wt, W, val.length, dp));
    }    
}