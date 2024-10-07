// https://www.geeksforgeeks.org/problems/bbt-counter4914/1
// Not Completed

public class BBTCounter {
    public static int bbt(int h) {
        int dp[] = new int[h + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= h; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        for(int n : dp) {
            System.out.print(n + " ");
        }

        return dp[h];
    }

    public static void main(String[] args) {
        int h = 3;
        System.out.println(bbt(h));
    }
}