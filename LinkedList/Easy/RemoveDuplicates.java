// https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list
// Not Completed.

public class RemoveDuplicates {
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

    public void removeDuplicates() {
        Node temp1 = head;
        Node temp2 = null;
        Node prev = null;
        
        while(temp1 != null && temp1.next != null) {
            temp2 = temp1;
            while(temp2.next != null) {
                if(temp1.data == temp2.data) {
                    System.out.print(temp1.data + " -> ");
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }System.out.print("Null");
    } // 12 -> 

    /*
     temp1 : 12
     temp2 : 12
     */

    public static void main(String[] args) {
        RemoveDuplicates ll = new RemoveDuplicates();

        ll.addFirst(21);
        ll.addFirst(43);
        ll.addFirst(41);
        ll.addFirst(21);
        ll.addFirst(12);
        ll.addFirst(11);
        ll.addFirst(12);

        // ll.print();
        ll.removeDuplicates();
    }  
}
