// https://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent

import java.util.Arrays;

public class MaximumSum {
    public static void maxSum(int arr[]) {
        int sum = arr[0];

        for(int i=1; i < arr.length-2; i++) {
            if(arr[i] > arr[i+1] && arr[i+1] > arr[i+2]) {
                if(i == arr.length-3) {
                    sum += arr[arr.length-1];
                }
                sum += arr[i];
            }
        }

        for(int i=1; i < arr.length-1; i++) {
            if(arr[i] < arr[i+1]) {
                if(i == arr.length-2) {
                    sum += arr[arr.length-1];
                    break;
                }
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        int arr[] = {5, 5, 10, 100, 10, 5};
        int arr2[] = {3, 2, 7, 10}; 
        System.out.print("Array 1 : ");
        maxSum(arr);
        System.out.print("Array 2 : ");
        maxSum(arr2);
    }
}
