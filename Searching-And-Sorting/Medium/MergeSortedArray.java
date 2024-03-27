// https://www.geeksforgeeks.org/merge-two-sorted-arrays-o1-extra-space

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1, 5, 9, 10, 15, 20}; 
        int arr2[] = {2, 3, 8, 13};

        for(int i=0; i < arr1.length; i++) {
            for(int j=0; j < arr2.length; j++) {
                if(arr1[i] > arr2[j]) {
                    arr1[i] = arr1[i] + arr2[j];
                    arr2[j] = arr1[i] - arr2[j];
                    arr1[i] = arr1[i] - arr2[j];
                }
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        System.out.print("Array 1 : ");
        for(int i=0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        
        System.out.println();
        
        System.out.print("Array 2 : ");
        for(int i=0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
