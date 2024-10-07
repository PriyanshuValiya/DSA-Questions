// https://www.geeksforgeeks.org/count-subsequences-product-less-k

import java.util.*;

public class SubseqProd {
    public static int subseqprod(int arr[], int k) {
        int n = arr.length;
        int dp[][] = new int[n + 1][k + 1];

        Arrays.fill(dp[0], 1);
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j / arr[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][k] - 1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int k = 10;

        System.out.println(subseqprod(arr, k));
    }
}