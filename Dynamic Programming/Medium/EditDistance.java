// https://practice.geeksforgeeks.org/problems/edit-distance3702/1

public class EditDistance {
    public static int editDistance(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }

                if (j == 0) {
                    dp[i][j] = i;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int res1 = dp[i][j - 1];
                    int res2 = dp[i - 1][j];
                    int res3 = dp[i - 1][j - 1];
                    dp[i][j] = Math.min(res1, Math.min(res2, res3)) + 1;
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1 = "geek";
        String str2 = "gesek";

        System.out.print(editDistance(str1, str2));
    }
}