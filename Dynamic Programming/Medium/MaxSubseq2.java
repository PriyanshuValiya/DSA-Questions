// https://www.geeksforgeeks.org/maximum-subsequence-sum-such-that-no-three-are-consecutive

public class MaxSubseq2 {
    public static int maxSubseq2(int arr[]) {
        if (arr.length == 1) {
            return arr[0];
        } else if (arr.length == 2) {
            return arr[0] + arr[1];
        }

        int n = arr.length;
        int dp[] = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[0] + arr[1];
        int flag = 2;

        for (int i = 2; i < arr.length; i++) {
            if ((flag + 1) % 3 == 0) {
                if (arr[i] > dp[i - 1]) {
                    dp[i] = arr[i];
                } else {
                    dp[i] = dp[i - 1];
                }
                flag = 0;
            } else {
                dp[i] = arr[i] + dp[i-1];
                flag++;
            }
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        int arr[] = { 3000, 2000, 1000, 3, 10 };
        System.out.println(maxSubseq2(arr));
    }
}