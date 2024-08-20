// https://www.geeksforgeeks.org/find-a-pair-with-the-given-difference

import java.util.*;

public class FindPairDifference {
    public static void getPair(int arr[], int diff) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if ((arr[j] - arr[i]) == diff) {
                    System.out.println("Pair Found: (" + arr[i] + ", " + arr[j] + ")");
                    return;
                }
            }
        }
        System.out.println("No Such Pair In Array");
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5, 20, 3, 2, 50, 80};

        System.out.print("Enter Difference : ");
        int diff = sc.nextInt();

        getPair(arr, diff);
    }
}
