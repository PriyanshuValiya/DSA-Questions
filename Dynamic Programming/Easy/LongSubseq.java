// https://practice.geeksforgeeks.org/problems/longest-repeating-subsequence2004/1

import java.util.*;

public class LongSubseq {
    public static int longSubseq(String str) {
        int dp[] = new int[str.length()];
        Arrays.fill(dp, 1);
        int max = Integer.MIN_VALUE;

        for(int i=1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)) {
                dp[i] = dp[i-1] + 1;
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
        String str = "axxzxy";
        System.out.print(longSubseq(str));
    }    
}