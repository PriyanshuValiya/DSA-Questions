// https://www.geeksforgeeks.org/weighted-job-scheduling

import java.util.Arrays;

public class JobProblem {
    public static int maxProfit(int arr[][]) {
        int dp[] = new int[arr.length];
        dp[0] = arr[0][2];
        
        for(int i = 0; i < arr.length; i++) {
            int lastIdx = arr[i][1];

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j][0] >= lastIdx) {
                    dp[j] = Math.max(dp[j], arr[i][2] + arr[j][2]);
                }
            }
        }

        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 50 },
                { 3, 5, 20 },
                { 6, 19, 100 },
                { 2, 100, 200 }
        };

        System.out.print(maxProfit(arr));
    }
}