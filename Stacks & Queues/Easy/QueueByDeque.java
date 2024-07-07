// https://www.geeksforgeeks.org/implement-stack-queue-using-deque

import java.util.*;

public class QueueByDeque {
    public static class Queue {
        Deque<Integer> dq = new LinkedList<>();

        // isEmpty
        public boolean isEmpty() {
            return dq.size() == 0;
        }

        // add 
        public void add(int data) {
            dq.addLast(data);
        }

        // remove 
        public int remove() {
            return dq.removeFirst();
        }

        // peek
        public int peek() {
            return dq.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
