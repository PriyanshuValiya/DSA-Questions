// https://leetcode.com/problems/implement-stack-using-queues

import java.util.*;

public class StackByQueue {
    public static void convert(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        if(q.size() == 0) {
            System.out.println("Empty Stack");
            return;
        }

        while(!q.isEmpty()) {
            s.push(q.remove());
        }

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        convert(q);
    }
}
