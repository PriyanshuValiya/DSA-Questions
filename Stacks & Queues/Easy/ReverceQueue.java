// https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1

import java.util.*; 

public class ReverceQueue {
    public static class Queues {
        Queue<Integer> q = new LinkedList<>();
        static int size = 0;
        
        public void enqueue(int data) {
            q.add(data);
            size++;
        }

        public int dequeue() {
            int front = q.remove();
            size--;
            return front;
        }

        public int size() {
            return size;
        }

        public int front() {
            return q.peek();
        }

        public void reverse(int k) {
            Stack<Integer> s = new Stack<>();
            int qSize = q.size();
            int front = 0;

            while(qSize - q.size() < k) {
                s.push(q.remove());
                front = s.peek();
            }

            while(s.size() != 0) {
                q.add(s.pop());
            }

            while(q.peek() != front) {
                q.add(q.peek());
                q.remove();
            }
        }
    } 

    public static void main(String[] args) {
        Queues q = new Queues();
        int k = 3;

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        
        q.reverse(k);

        while(q.size() != 0) {
            System.out.println(q.front());
            q.dequeue();
        }
    }
}
