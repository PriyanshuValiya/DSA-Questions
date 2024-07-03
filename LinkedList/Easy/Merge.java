public class Merge {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node head1;
    public static Node head2;


    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) { 
            head = newNode;
            return;
        }
        newNode.next = head; 
        head = newNode;  
    }

    public static Node merge(Node head1, Node head2) {
        Node newLL = new Node(-1);
        Node temp = newLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        
        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return newLL.next;
    }

    public static void print(Node head) { 
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]) {
        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);

        head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);

        merge(head1, head2);
        print(head1);
    }
}