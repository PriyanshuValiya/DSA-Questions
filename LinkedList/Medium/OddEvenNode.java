// https://www.geeksforgeeks.org/segregate-even-and-odd-elements-in-a-linked-list

import java.util.LinkedList;

public class OddEvenNode {
    public static void segregateNodes(LinkedList<Integer> ll) {
        LinkedList<Integer> newll = new LinkedList<>();
        int idx = 0;

        while(idx < ll.size()) {
            if(ll.get(idx) % 2 != 0) {
                newll.addLast(ll.get(idx));
            } else {
                newll.addFirst(ll.get(idx));
            }
            idx++;
        }

        // Reverce First Half Set to get Complete Answer.

        System.out.println(newll);
    }

    public static void main(String[] args) {
       LinkedList<Integer> ll = new LinkedList<>();
       
       ll.addFirst(6);
       ll.addFirst(7);
       ll.addFirst(1);
       ll.addFirst(4);
       ll.addFirst(5);
       ll.addFirst(10);
       ll.addFirst(12);
       ll.addFirst(8);
       ll.addFirst(15);
       ll.addFirst(17);

       System.out.println(ll);
       segregateNodes(ll);
    }
}
