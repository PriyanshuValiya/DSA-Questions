// https://www.geeksforgeeks.org/find-expression-duplicate-parenthesis-not

import java.util.*;

public class DuplicatePara {
    public static boolean isDuplicatePara(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i < str.length(); i++) {
            if(str.charAt(i) == ')') {
                int count = 0;
                while(s.pop() != '(') {
                    count++;
                }

                if(count < 1) {
                    return true;
                }
            } else {
                s.push(str.charAt(i));
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+b) * (c+d) + e))";
        System.out.println(isDuplicatePara(str));
    }
}
