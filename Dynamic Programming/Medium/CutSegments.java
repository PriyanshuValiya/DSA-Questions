// https://practice.geeksforgeeks.org/problems/cutted-segments1642/1

import java.util.*;

public class CutSegments {
    public static int cutSegment(int[] cuts, int n, int dp[]) {
        if (n == 0) {
            return 0;
        } else if(n < 0) {
            return -1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int maxCuts = 0;

        for (int cut : cuts) {
            int result = cutSegment(cuts, n - cut, dp);
            if (result != -1) {
                maxCuts = Math.max(maxCuts, result + 1);  
            }
        }

        dp[n] = maxCuts;
        return dp[n];
    }

    public static void main(String[] args) {
        int[] cuts = {2, 3, 5};
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(cutSegment(cuts, n, dp));
    }
}