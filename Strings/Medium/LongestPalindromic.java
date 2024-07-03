// https://leetcode.com/problems/longest-palindromic-substring

public class LongestPalindromic {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;

        if(str.length() == 1) {
            return false;
        }

        while (left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void longestPalindrome(String str) {
        String newStr = "";
        int maxLength = 0;
        
        for(int i=0; i < str.length()-1; i++) {
            for(int j=i+1; j < str.length(); j++) {
                if(isPalindrome(str.substring(i, j+1))) {
                    newStr = str.substring(i, j+1);
                    maxLength = Math.max(maxLength, newStr.length());

                    if(maxLength == newStr.length()) {
                        System.out.println("Longest Palindrome Word : " + newStr);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "habcdcbapr";
        longestPalindrome(str);
    }
}
