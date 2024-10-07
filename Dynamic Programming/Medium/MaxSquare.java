// https://practice.geeksforgeeks.org/problems/largest-square-formed-in-a-matrix0806/1

public class MaxSquare {
    public static int maxSquare(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        int dp[][] = new int[n][m];

        for (int i = 1; i < dp.length-1; i++) {
            for (int j = 1; j < dp[0].length-1; j++) {
                if((mat[i+1][j] == 1 && mat[i][j+1] == 1) || (mat[i-1][j] == 1 && mat[i][j-1] == 1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
            }
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (dp[i][j] > max) {
                    max = dp[i][j]; 
                }
            }
        }


        return max;
    }

    public static void main(String[] args) {
        int mat[][] = {
                { 0, 1, 1, 0, 1 },
                { 1, 1, 0, 1, 0 },
                { 0, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0 }
        };

        System.out.println(maxSquare(mat));
    }
}