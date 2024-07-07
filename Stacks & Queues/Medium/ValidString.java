// https://www.geeksforgeeks.org/length-of-the-longest-valid-substring

import java.util.*;

public class ValidString {
    public static void getValidStr(String str) {
        Stack<Character> s = new Stack<>();
        String temp = "";

        for(int i=0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                s.push('(');
                temp += '(';
            } else {
                if(s.isEmpty()) {
                    System.out.println(temp);
                    System.out.println("Size Of Longest Valid String : " + temp.length());
                    return ;
                }

                if(s.peek() == '(') {
                    temp += ")";
                    s.pop();
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "()(()))))";
        getValidStr(str);
    }
}
