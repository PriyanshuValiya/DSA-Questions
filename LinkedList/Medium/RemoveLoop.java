// https://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list

public class RemoveLoop { 
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void isCycle() { 
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next;
            if(slow == fast) {
                System.out.println("Loop Exist");
                return;
            }
        }
        System.out.println("Loop Does Not Exist");
    }

    public void removeLoop() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) {
                cycle = true;
                break;
            }
        }
        
        if(cycle == false) {
            return;
        }

        slow = head;
        Node prev = null;
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
        System.out.println("Loop Removed !!");
    }



    public static void main(String[] args) {
        RemoveLoop ll = new RemoveLoop();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next;

        ll.isCycle();
        ll.removeLoop();
        ll.isCycle();
    }
}
