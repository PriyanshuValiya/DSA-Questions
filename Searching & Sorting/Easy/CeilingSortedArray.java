// https://www.geeksforgeeks.org/ceiling-in-a-sorted-array

import java.util.*;

public class CeilingSortedArray {
    public static void searchCeiling(int arr[], int key) {
        if(key < arr[0]) {
            System.out.println("Floor Doesn't Exist In Array, Ceil = " + arr[0]);
        } else if (key > arr[arr.length-1]) {
            System.out.println("Floor = " + arr[arr.length-1] + ", Ceil Doesn't Exist In Array");
        } 

        for(int i=0; i < arr.length-1; i++) {
            if(arr[i] == key) {
                System.out.println("Floor = " + arr[i] + ", Ceil = " + arr[i]);
            } else if(key > arr[i] && key < arr[i+1]) {
                System.out.println("Floor = " + arr[i] + ", Ceil = " + arr[i+1]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 8, 10, 13, 18, 25};
        System.err.print("Enter Key Value : ");
        int key = sc.nextInt();

        searchCeiling(arr, key);
    }
}
