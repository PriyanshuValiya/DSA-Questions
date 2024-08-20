// https://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array

import java.util.*;

public class KLargestEle {
    public static void getKLargestEle(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int n : arr) {
            pq.add(n);
        }

        for(int i=0; i < k; i++) {
            System.out.print(pq.remove() + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;

        getKLargestEle(arr, k);
    }    
}