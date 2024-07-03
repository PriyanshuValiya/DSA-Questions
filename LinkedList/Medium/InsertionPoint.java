// https://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists

import java.util.Collections;
import java.util.LinkedList;

public class InsertionPoint {
    public static void getIntersectionNode(LinkedList<Integer> first, LinkedList<Integer> second) {
        int i = 0;
        int prev = 0;

         while(i < first.size() && i < second.size()) {
            if(first.get(i) != second.get(i)) {
                System.out.println("Intersection Point : " + prev);
                return;
            }
            prev = first.get(i);
            i++;
         }
   }


    public static void main(String[] args) {
        LinkedList<Integer> first = new LinkedList<>();
        LinkedList<Integer> second = new LinkedList<>();

        first.addFirst(30);
        first.addFirst(15);
        first.addFirst(9);
        first.addFirst(6);
        first.addFirst(3);
        Collections.reverse(first);
        System.out.println("Fist LL : " + first);

        second.addFirst(30);
        second.addFirst(15);
        second.addFirst(10);
        Collections.reverse(second);
        System.out.println("Second LL : " + second);

        getIntersectionNode(first, second);
    }
}
