package Greedy.Medium;

// https://www.geeksforgeeks.org/maximize-sum-consecutive-differences-circular-array

import java.util.*;

public class MaxSum {
    public static void getMaxSum(int arr[]) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        int sum = 0;

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length-1;

        while(left < right) {
            arr1.add(arr[left]);
            arr1.add(arr[right]);
            left++;
            right--;
        }

        int i = 0;
         while(i < arr1.size()-1) {
            sum += Math.abs(arr1.get(i) - arr1.get(i+1));
            i++;
         }

         sum += Math.abs(arr1.get(0) - arr1.get(arr1.size()-1));

        System.out.println("Max Sum : " + sum);
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 8};

        getMaxSum(arr);
    }
}
