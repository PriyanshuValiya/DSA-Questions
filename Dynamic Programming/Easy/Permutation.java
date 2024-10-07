// https://www.geeksforgeeks.org/permutation-coefficient

import java.util.*;

public class Permutation {
    public static int count(int p, int k, int ans, int dp[]) {
        if (k == 0) {
            return ans;
        }

        if (dp[k] != -1) {
            return dp[k];
        }

        return dp[k] = count(p - 1, k - 1, ans * p, dp);
    }

    public static void main(String[] args) {
        int dp[] = new int[4];
        Arrays.fill(dp, -1);

        System.out.print(count(10, 3, 1, dp));
    }
}