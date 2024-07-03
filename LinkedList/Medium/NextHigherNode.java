// https://www.geeksforgeeks.org/point-to-next-higher-value-node-in-a-linked-list-with-an-arbitrary-pointer

public class NextHigherNode {
    public static class Node {
        int data;
        Node next;
        Node arbit;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.arbit = null;
        }
    }

    public static Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean isCycle() { 
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
            if(slow == fast) {
                return true;
            }
        }

        return false; 
    }

    public void setArbit() {
        Node ptr = head;

        while (ptr.next != null) {
            if (ptr.data < ptr.next.data) {
                ptr.arbit = ptr.next;
                System.out.print(ptr.data + " => ");
            } else {
                System.out.print(ptr.data + " -> ");
            }
            ptr = ptr.next;
        }

        if(ptr.data < head.data) {
            System.out.print(ptr.data + " => " + head.data);
            ptr.next = head;
        } else {
           System.out.print(ptr.data + " -> null");
        }
    }

    public static void main(String[] args) {
        NextHigherNode ll = new NextHigherNode();

        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(10);
        ll.addFirst(5);

        ll.print();
        ll.setArbit();
        System.out.println("\n" + ll.isCycle());
    }
}
