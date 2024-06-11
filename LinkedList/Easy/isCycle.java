// https://leetcode.com/problems/linked-list-cycle

public class isCycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    } 

    public static Node head;
    public static Node tail;

    public void Iscycle() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

              if(slow == fast) {
               System.out.println("There Is A Cycle In The Linked List");
               return;
              }
        }
         System.out.println("There Is No Cycle In The Linked List.");
    }

    public static void main(String[] args) {
        isCycle ll = new isCycle();

        head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;

        ll.Iscycle();
    }
}
