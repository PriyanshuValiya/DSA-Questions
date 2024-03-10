// Q : Print Reverce Array of given Array.

import java.util.*;

public class ReverceArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int newArr[] = new int[arr.length];

        for(int i=0; i < arr.length; i++) {
            newArr[i] = arr[arr.length-1-i];
        }
        
        System.out.println("Reverced Array : ");

        for(int i=0; i < arr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}