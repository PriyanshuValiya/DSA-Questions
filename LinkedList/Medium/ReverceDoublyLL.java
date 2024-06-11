// https://practice.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1

public class ReverceDoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        newNode.prev = null;
        head = newNode;
    }

    public void print() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void reverce() {
        Node prev = null;
        Node curr = head;
        Node next;

        if(head == null) {
            System.out.println("Empty Doubly LinkedList");
            return;
        } 

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        ReverceDoublyLL dll = new ReverceDoublyLL();

        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.println();
        dll.reverce();
        dll.print();
    }
}
