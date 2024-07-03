// https://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space

import java.util.*;

// Space Complexicity - O(n)

public class FindDuplicate {
    public static void getDuplicates(int arr[]) {
        Arrays.sort(arr);

        System.out.print("Repeate Elements : ");

        for(int i=0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 3, 6, 1};
        getDuplicates(arr);
    }   
} 
