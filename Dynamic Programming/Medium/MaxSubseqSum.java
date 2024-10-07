// https://practice.geeksforgeeks.org/problems/maximum-sum-increasing-subsequence4749/1

public class MaxSubseqSum {
    public static int getMaxSum(int arr[]) {
        int n = arr.length;
        int dp[] = new int[n];
        int max = dp[0];

        for (int i = 0; i < dp.length; i++) {
            dp[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] += arr[j];
                }
            }
        }

        for (int i = 1; i < dp.length; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 101, 2, 3, 100 };
        System.out.println(getMaxSum(arr));
    }
}