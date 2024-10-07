// https://practice.geeksforgeeks.org/problems/reach-a-given-score-1587115621/1

public class ReachScore {
    public static int reachScoreMemo(int n, int steps[]) {
        int w = steps.length;
        int dp[][] = new int[w + 1][n + 1];

        for (int i = 0; i < w + 1; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < n + 1; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i < w + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (steps[i - 1] <= j) {
                    dp[i][j] = dp[i][j - steps[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[w][n];
    }

    public static void main(String[] args) {
        int steps[] = {3, 5, 10};
        int n = 20;

        System.out.println(reachScoreMemo(n, steps));
    }
}