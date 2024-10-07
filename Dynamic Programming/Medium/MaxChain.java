// https://practice.geeksforgeeks.org/problems/max-length-chain/1

import java.util.*;

public class MaxChain {
    public static void getMaxLength(int p[][]) {
        int dp[][] = new int[p.length][p[0].length+1];
        int maxLength = 1;

        for(int i=0; i < dp.length; i++) {
            dp[i][0] = i+1;
            dp[i][1] = p[i][0];
            dp[i][2] = p[i][1];
        }

        Arrays.sort(dp, Comparator.comparingDouble(o -> o[1]));
        int prevMax = dp[0][2];

        for(int i=1; i < dp.length; i++) {
            if(dp[i][1] > prevMax) {
                maxLength++;
                prevMax = dp[i][2];
            }
        }

        System.out.println(maxLength);
    }

    public static void main(String[] args) {
        int p[][] = {{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90}}; 
        getMaxLength(p);
    }
}