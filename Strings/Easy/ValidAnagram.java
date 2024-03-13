// https://leetcode.com/problems/valid-anagram

import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            char sChar[] = s.toUpperCase().toCharArray();
            char tChar[] = t.toUpperCase().toCharArray();
            Arrays.sort(sChar);
            Arrays.sort(tChar);
            if (Arrays.equals(sChar, tChar)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean res = isAnagram(s, t);
        System.out.println((res) ? "Anagrams" : "Not Anagrams");
    }
}