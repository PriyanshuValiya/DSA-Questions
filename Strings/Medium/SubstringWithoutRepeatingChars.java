// https://leetcode.com/problems/longest-substring-without-repeating-characters

import java.util.*;

public class SubstringWithoutRepeatingChars {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newStr.length());
            return;
        }

        char currChar = str.charAt(idx);

        if(map[currChar - 'a'] == true) {
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        removeDuplicates(name, 0, new StringBuilder(""), new boolean[26]);
    }
}