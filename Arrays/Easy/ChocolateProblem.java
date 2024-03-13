// https://www.geeksforgeeks.org/chocolate-distribution-problem/

import java.util.*;

public class ChocolateProblem {
    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
        Arrays.sort(arr); 
        int max=0, min=0, diff=0;

        for(int i=0; i < arr.length-1; i++) {
            if(i+m-1 >= arr.length) {
                break;
            }
             min = arr[i]; 
             max = arr[i + m - 1];
             diff = max - min; 
        }

        System.out.println("Minimum Difference is : " + diff);
    }  
}