// https://practice.geeksforgeeks.org/problems/longest-alternating-subsequence5951/1

import java.util.Arrays;

public class AltSubseq {
    public static int altSubseq(int arr[]) {
        int n = arr.length;
        int dp[] = new int[n];
        boolean flag = true;

        dp[0] = 0;
        dp[1] = 1;

        if(arr[0] > arr[1]) {
            flag = false;
        }

        for (int i = 2; i < n; i++) {
            if (flag) {
                if (arr[i] < arr[i - 1]) {
                    dp[i] = dp[i - 1] + 1;
                    flag = !flag;
                } else {
                    dp[i] = dp[i - 1];
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    dp[i] = dp[i - 1] + 1;
                    flag = !flag;
                } else {
                    dp[i] = dp[i - 1];
                }
            }
        }

        System.out.println(Arrays.toString(dp));
        
        return dp[n-1] + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 };

        System.out.println(altSubseq(arr));
    }
}