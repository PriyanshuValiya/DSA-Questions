// https://www.geeksforgeeks.org/sort-a-stack-using-recursion

import java.util.*;

public class SortStack {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty() || data > s.peek()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void sort(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        sort(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);

        sort(s);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }  
}

/*
 -3
 14        14
 18        18   
 -5        -5               -5
 30  -->   30  --> ... -->  30
*/