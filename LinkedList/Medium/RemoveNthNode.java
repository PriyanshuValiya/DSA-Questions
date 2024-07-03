// https://leetcode.com/problems/remove-nth-node-from-end-of-list

public class RemoveNthNode { 
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
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
        head = newNode;
    }

    public void print() { // O(n)
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void removeNthNode(int n) {
        Node temp = head;
        int size = 0;

        while(temp != null) {
            temp = temp.next;   
            size++;
        }

        if(n == size) {
            head = head.next;
            return;
        } else if (n > size) {
            System.out.println("Entered Node Does't Exist");
            return;
        }

        int i = 1;
        int nm1thNode = size-n; 
        Node prev = head;

        while(i < nm1thNode) {
            prev = prev.next; 
            i++;
        }
        
        prev.next = prev.next.next;
    }


    public static void main(String[] args) {
        RemoveNthNode ll = new RemoveNthNode();
        
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        int n = 2;

        ll.print();
        ll.removeNthNode(n);
        ll.print();
    }   
}
