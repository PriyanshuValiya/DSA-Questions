// https://www.geeksforgeeks.org/program-nth-catalan-number

import java.util.*;

public class CatalanNumber {
    public static int catalanNumber(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        System.out.println(Arrays.toString(dp));
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(catalanNumber(n));
    }
}