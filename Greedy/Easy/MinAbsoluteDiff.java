package Greedy.Easy;

// https://www.geeksforgeeks.org/minimum-sum-absolute-difference-pairs-two-arrays

import java.util.*;

public class MinAbsoluteDiff {
    public static void main(String args[]) {
        int A[] = {4, 1, 8, 7};
        int B[] = {2, 3, 6, 5};

        Arrays.sort(A);
        Arrays.sort(B);
        
        int sum = 0;

        for(int i = 0; i < A.length; i++) {
            sum += Math.abs(A[i] - B[i]);
        }

        System.out.println("Min Absolute Diff : " + sum);
    }
}