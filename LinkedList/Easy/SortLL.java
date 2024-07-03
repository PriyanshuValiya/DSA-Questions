// https://leetcode.com/problems/reverse-linked-list/description

public class SortLL {
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
        System.out.print("Null");
    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

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

        return mergedLL.next;
    }

    public Node sort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node rightNode = mid.next;
        mid.next = null;

        
        Node newLeft = sort(head);
        Node newRight = sort(rightNode);

        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        SortLL ll = new SortLL();

        ll.addFirst(1);
        ll.addFirst(0); 
        ll.addFirst(2);
        ll.addFirst(0); 
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(1);

        ll.head = ll.sort(ll.head);
        ll.print();
    }
}
