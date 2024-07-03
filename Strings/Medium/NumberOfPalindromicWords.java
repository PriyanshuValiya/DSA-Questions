// https://leetcode.com/problems/palindromic-substrings

public class NumberOfPalindromicWords {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;

        while (left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    } 

    public static void countSubstrings(String str) {
        String newStr = "";
        int count = 0;
        str += " ";

        
        for(int i=0; i < str.length(); i++) {
            for(int j=i+1; j < str.length(); j++) {
                if(isPalindrome(str.substring(i, j))) {
                    newStr = str.substring(i, j);
                    System.out.print(newStr + " ");
                    count++;
                }
            }
        }

        System.out.println("\nCount : " + count);

    }

    public static void main(String[] args) {
        String str = "aab";
        countSubstrings(str);
    }
}
