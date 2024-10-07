public class LPS {
    static String longestPalindrome = "";

    public static boolean isPalindrome(String str) {
        if (str.length() == 0) {
            return true;
        }

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void lpsUtil(String str, int i, String ans) {
        if (i == str.length()) {
            if (isPalindrome(ans)) {
                if (ans.length() > longestPalindrome.length()) {
                    longestPalindrome = ans;
                }
            }

            return;
        }

        lpsUtil(str, i + 1, ans + str.charAt(i));
        lpsUtil(str, i + 1, ans);
    }

    public static int lps(String str) {
        lpsUtil(str, 0, "");

        return longestPalindrome.length();
    }

    public static void main(String[] args) {
        String str = "GEEKSFORGEEKS";
        System.out.println(lps(str));
    }
}