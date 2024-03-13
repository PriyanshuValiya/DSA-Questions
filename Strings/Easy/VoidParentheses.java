// https://leetcode.com/problems/valid-parentheses

import java.util.*;

public class VoidParentheses {
    public static void main(String[] args) {
        String str = "(){}[]";
       int flag = 0;

       for(int i=0; i < str.length(); i++) {
        if(str.charAt(i) == '(') {
            flag += 1;
        } else if(str.charAt(i) == '{') {
            flag += 2;
        } else if (str.charAt(i) == '[') {
            flag += 3;;
        } else if (str.charAt(i) == ')') {
            flag -= 1;
        } else if (str.charAt(i) == '}') {
            flag -= 2;;
        } else if (str.charAt(i) == ']') {
            flag -= 3;
        } else {
            continue;
        }
       }


       if(flag == 0) {
        System.out.println("True");
       } else {
        System.out.println("False");
       }
    }  
}