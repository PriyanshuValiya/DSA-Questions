// https://www.geeksforgeeks.org/k-numbers-difference-maximum-minimum-k-number-minimized/

import java.util.*;

public class MinDiff {
    public static void main(String[] args) {
        int arr[] = {10, 100, 300, 200, 1000, 20, 30};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        int a = pq.peek();
        int b = 0;

        for(int i=0; i < k; i++) {
            if(i == k-1) {
                b = pq.peek();
            }
            pq.remove();
        }

        System.out.println("Minimum Difference : " + Math.abs(a-b));
    } 
}
