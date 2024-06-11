// https://leetcode.com/problems/reorder-list/description

public class ReorderList {
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

    public Node getMid() {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void reorderList() {
        Node mid = getMid();
        Node rightHead = mid.next;
        mid.next = null;

        // Reverce Second Half List

        Node prev = null;
        Node curr = rightHead;
        Node next;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        ReorderList ll = new ReorderList();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        ll.reorderList();
        ll.print();
    }
}
