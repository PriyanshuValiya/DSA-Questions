// https://www.geeksforgeeks.org/make-array-elements-equal-minimum-cost

import java.util.Arrays;

public class EqualElements {
    public static int getAvg(int arr[]) {
        Arrays.sort(arr);

        if(arr.length % 2 == 0) {
            return arr[(arr.length / 2) - 1];
        } else {
            return arr[arr.length / 2];
        }
    }

    public static void equalElement(int arr[]) {
        int avg = getAvg(arr);
        int cost = 0;

        for(int i=0; i < arr.length; i++) {
            cost += Math.abs(avg - arr[i]);
        }

        System.out.println("Minimum Cost : " + cost);
    }

    public static void main(String[] args) {
        int arr[] = {1, 100, 101};
        int arr2[] = {4, 6};
        equalElement(arr);
        equalElement(arr2);
    }
}
