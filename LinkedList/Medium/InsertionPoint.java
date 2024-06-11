// https://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists
// Not Complete

public class InsertionPoint {
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

    public static void print(Node head) { // O(n)
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void getIntersectionNode(Node n1, Node n2) {
        while(n2 != null) {
            while(n1 != null) {
              if(n2.data == n1.data) {
                System.out.println("Intersection Point : " + n2.data);
                return;
              }
             n1 = n1.next;
            }
         n2 = n2.next;
        }

        System.out.println("No Intersection Point Is Found !!");
   }


    public static void main(String[] args) {
        Node first = new Node(3);
        first.next = new Node(6);
        first.next.next = new Node(9);
        first.next.next.next = new Node(15);
        first.next.next.next.next = new Node(30);
        print(first);

        Node second = new Node(10);
        second.next = new Node(15);
        second.next.next = new Node(30);
        print(second);

        getIntersectionNode(first, second);
    }
}
