// https://leetcode.com/problems/longest-substring-without-repeating-characters
// Not Completed: Try This With Hash Or Map.

import java.util.*;

public class SubstringWithoutRepeatingChars {
    public static void lengthOfLongestSubstring(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println("Max. Length : " + newStr.length());
            return;
        }

        char currChar = str.charAt(idx);

        if(map[currChar - 'a'] == true) {
            lengthOfLongestSubstring(str, idx+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            lengthOfLongestSubstring(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String name = sc.next();
        lengthOfLongestSubstring(name, 0, new StringBuilder(""), new boolean[26]);
    }
}