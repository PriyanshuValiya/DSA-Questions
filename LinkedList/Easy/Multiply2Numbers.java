// https://www.geeksforgeeks.org/multiply-two-numbers-represented-linked-lists

public class Multiply2Numbers {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static int size;

    public static void print(Node head) { // O(n)
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static int multiply2Numbers(Node n1, Node n2) {
        int mula = 0, mulb = 0;
        String num1 = "", num2 = "";

        while(n1 != null || n2 != null) {
            if(n1 == null && n2 == null) {
                break;
            } else if(n1 != null && n2 == null) {
                num1 += Integer.toString(n1.data);
                n1 = n1.next;
            } else {
                num1 += Integer.toString(n1.data);
                num2 += Integer.toString(n2.data);
                n1 = n1.next;
                n2 = n2.next;
            }
        }

        mula = Integer.parseInt(num1);
        mulb = Integer.parseInt(num2);
        return mula * mulb;
    }

    public static void main(String args[]) {
        Node first = new Node(9); 
        first.next = new Node(4); 
        first.next.next = new Node(6); 
        System.out.print("First List is: "); 
        print(first); 
  
        Node second = new Node(8); 
        second.next = new Node(4); 
        System.out.print("Second List is: "); 
        print(second); 
  
       int ans =  multiply2Numbers(first, second);
       System.out.print("Result is : " + ans); 
    }
}