// https://practice.geeksforgeeks.org/problems/circular-tour/1

import java.util.*;

public class CircularTour {
    public static void getStart(int petrol[], int distance[]) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int j = 0;

        for(int i=0; i < petrol.length; i++) {
            q1.add(petrol[i]);
            q2.add(distance[i]);
        }

        while(!q1.isEmpty() && !q2.isEmpty()) {
            if(q1.remove() > q2.remove()) {
                System.out.println("Starting Point : " + j);
                break;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int petrol[] = {4, 6, 7, 4};
        int distance[] = {6, 5, 3, 5};
        getStart(petrol, distance);
    }
}
