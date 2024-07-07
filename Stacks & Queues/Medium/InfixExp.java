// https://www.geeksforgeeks.org/convert-infix-expression-to-postfix-expression

import java.util.*;

public class InfixExp {
    public static void convert(String str) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> s = new Stack<>();
        Character prevChar = '+';

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/' || str.charAt(i) == '%') {
                if(str.charAt(i) - prevChar > 0) {
                    s.push(str.charAt(i));
                } else {
                    postfix.append(s.pop());
                }
                prevChar = str.charAt(i);
            } else {
                postfix.append(str.charAt(i));
            }
        }

        System.out.println("Postfix String : " + postfix);
    }

    public static void main(String[] args) {
        String str = "a/b%c+d*e-f";
        convert(str);
    }
}
