// https://practice.geeksforgeeks.org/problems/maximum-difference-of-zeros-and-ones-in-binary-string4111/1
// Not Completed

public class MaxDiff {
    public static int maxDiff(String s, String ans, int i, int max) {
        if(i == s.length()) {
            int count = 0;

            for(int j=0; j < ans.length(); j++) {
                if(ans.charAt(j) == 0) {
                    count++;
                } else {
                    count--;
                }
            }

            max = Math.max(max, count);
            return max;
        }

        return maxDiff(s, ans + s.charAt(i), i+1, max) + maxDiff(s, ans, i+1, max);
    }

    public static void main(String[] args) {
        String s = "11000010001";
        int max = 0;

        max = maxDiff(s, new String(""), 0, max);
        System.out.println(max);
    }    
}