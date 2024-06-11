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

    public void print() { // O(n)
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void deleteNode() {
        Node prev = head;
        Node temp = head.next;
        Node temp2;

        while(temp != null) {
            temp2 = head;
            if(prev.data > temp.data) {
                prev = prev.next.next;
            }
            prev = prev.next;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DeleteNode ll = new DeleteNode();
        
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        ll.deleteNode();
        ll.print();
    }   
}