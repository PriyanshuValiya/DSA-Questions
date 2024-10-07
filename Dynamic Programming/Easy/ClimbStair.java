// https://leetcode.com/problems/climbing-stairs

import java.util.*;

public class ClimbStair {
    public static int climbStair(int n, int dp[]) {
        if(n == 0 || n == 1) {
            return 1;
        }

        if(dp[n] != -1) {
            return dp[n];
        }
        
        return dp[n] = climbStair(n-1, dp) + climbStair(n-2, dp);
    }

    public static void main(String[] args) {
        int n = 3;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);

        System.out.println(climbStair(n, dp));
    }   
}