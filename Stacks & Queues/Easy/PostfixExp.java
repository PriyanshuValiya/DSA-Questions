// https://www.geeksforgeeks.org/stack-set-4-evaluation-postfix-expression

import java.util.*;

public class PostfixExp {
    public static void postfixExp(String equ) {
        Stack<Integer> s = new Stack<>();

        for(int i=0; i < equ.length(); i++) {
            Character ch = equ.charAt(i);

            if(Character.isDigit(ch)) {
                s.push(ch - '0');
            } else {
                int val1 = s.pop();
                int val2 = s.pop();
                int res = 0;

                if(ch == '+') {
                    res = val1 + val2;
                } else if(ch == '-') {
                    res = val2 - val1;
                } else if(ch == '*') {
                    res = val1 * val2;
                } else if(ch == '/') {
                    res = val1 / val2;
                }

                s.push(res);
            }
        }

        System.out.println(s.peek());
    }

    public static void main(String[] args) {
        String equ = "231*+9-";
        postfixExp(equ);
    }
}