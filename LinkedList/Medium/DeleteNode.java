// https://www.geeksforgeeks.org/delete-nodes-which-have-a-greater-value-on-right-side

public class DeleteNode {
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

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void deleteNode() {
        Node ptr = head;

        while(ptr != null && ptr.next != null) {
            if(ptr.data > ptr.next.data) {
                ptr = ptr.next;
            } else {
                ptr.next = ptr.next.next;
            }
        }
    }

    public static void main(String[] args) {
        DeleteNode ll = new DeleteNode();
        
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(11); 
        ll.addFirst(10);
        ll.addFirst(15);
        ll.addFirst(12); 

        ll.print();
        ll.deleteNode();
        ll.print();
    }   
}