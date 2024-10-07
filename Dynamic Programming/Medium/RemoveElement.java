// http://geeksforgeeks.org/minimum-removals-array-make-max-min-k

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int arr[], int i, int j, int k, int dp[][]) {
        if (i >= j) {
            return 0;
        } else if ((arr[j] - arr[i]) <= k) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        dp[i][j] = Math.min(removeElement(arr, i + 1, j, k, dp), removeElement(arr, i, j - 1, k, dp)) + 1;
        return dp[i][j];
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 9, 10, 11, 12, 17, 20};
        int k = 4;
        int dp[][] = new int[arr.length][arr.length];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        Arrays.sort(arr);

        System.out.println(removeElement(arr, 0, arr.length - 1, k, dp));
    }
}