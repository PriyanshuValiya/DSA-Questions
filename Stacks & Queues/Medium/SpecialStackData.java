// https://www.geeksforgeeks.org/design-and-implement-special-stack-data-structure

import java.util.*;

public class SpecialStackData {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int temp = s.pop();
        pushAtBottom(s, data);
        s.push(temp);
    }

    public static void getMin(Stack<Integer> s) {
        if(s.size() == 1) {
            System.out.println("Minimum Element : " + s.peek());
            return;
        }

        Stack<Integer> dummy = new Stack<>();
        int sizeOfS = s.size();
        int i = 1;
        int temp = s.pop();

        while(i < sizeOfS) {
            if(s.peek() < temp) {
                pushAtBottom(dummy, s.pop());
            } else {
                s.pop();
            }
            i++;
        }

        getMin(dummy);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(18);
        s.push(19);
        s.push(15);
        s.push(29);
        s.push(16);

        System.out.println(s);
        getMin(s);
    }
}