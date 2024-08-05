package Greedy.Medium;

// https://www.geeksforgeeks.org/fractional-knapsack-problem

import java.util.*;

public class KnapsackProblem {
    public static void getProfit(int arr[][], int W) {
        double ratio[][] = new double[arr.length][2];

        for(int i = 0; i < arr.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = arr[i][0] / (double)arr[i][1];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal = 0;

        for(int i = ratio.length-1; i >= 0; i--) {
            if(capacity >= arr[i][1]) {
                finalVal += arr[i][0];
                capacity -= arr[i][1];
            } else {
                finalVal += (int)(ratio[i][1] * capacity);
                break;
            }
            System.out.println(finalVal);
        }

        System.out.println("Total Max Profit : " + finalVal);
    }

    public static void main(String[] args) {
        int arr[][] = {{60, 10}, {100, 20}, {120, 30}};
        int W = 50;

        getProfit(arr, W);
    }
}
