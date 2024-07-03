// https://www.geeksforgeeks.org/chocolate-distribution-problem/
// Not Completed

import java.util.*;

public class ChocolateProblem {
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        int diffArr[] = new int[arr.length-1];
        Arrays.sort(arr); 

            for(int j=0; j < arr.length-1 && j < arr.length+1-m; j++) {
                diffArr[j] = arr[j+m-1] - arr[j];
            }

            Arrays.sort(diffArr);

        System.out.println("Minimum Difference is : " + diffArr[diffArr.length-m+1]);
    }  
}