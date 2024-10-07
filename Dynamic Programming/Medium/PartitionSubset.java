// https://practice.geeksforgeeks.org/problems/subset-sum-problem2014/1

public class PartitionSubset {
    public static boolean isSubset(int arr[], int N) {
        int n = arr.length;
        int dp[][] = new int[n + 1][N + 1];
        int W = N / 2;

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = Math.max(arr[i - 1] + dp[i - 1][j - arr[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W] == N / 2;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 11, 5};
        int sum = 0;

        for (int n : arr) {
            sum += n;
        }

        System.out.println(isSubset(arr, sum));
    }
}