// https://leetcode.com/problems/valid-palindrome/

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.toLowerCase().replaceAll("[@,:;<>/\\s]", "");

        for(int i=0; i < (s.length())/2; i++) {
            if(s.charAt(i) == s.charAt(s.length()-1-i)) {
                if(i == (s.length() /2 ) - 1) {
                    System.out.println("Palindrome"); 
                    break;
                }  
                continue;
            } else {
                System.out.println("Not Palindrome");
            }
        }
    }   
}