// https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

import java.util.Arrays;

public class MinJump {
    public static int minJump(int arr[]) {
        int n = arr.length;
        int dp[] = new int[n];

        Arrays.fill(dp, -1);
        dp[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            int step = arr[i];
            int ans = Integer.MAX_VALUE;

            for (int j = i + 1; j <= i + step && j < n; j++) {
                if (dp[j] != -1) {
                    ans = Math.min(ans, dp[j] + 1);
                }
            }

            if (ans != Integer.MAX_VALUE) {
                dp[i] = ans;
            }
        }

        return dp[0];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };

        System.out.println(minJump(arr));
    }
}