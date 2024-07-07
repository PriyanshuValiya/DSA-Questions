// https://www.geeksforgeeks.org/implement-stack-queue-using-deque

import java.util.*;

public class StackByDeque {
    public static class Stack {
        Deque<Integer> dq = new LinkedList<>();

        // isEmpty
        public boolean isEmpty() {
            return dq.size() == 0;
        }

        // push
        public void push(int data) {
            dq.addLast(data);
        }

        // pop
        public int pop() {
            return dq.removeLast();
        }

        // peek
        public int peek() {
            return dq.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
