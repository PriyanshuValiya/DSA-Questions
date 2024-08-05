package Greedy.Easy;
// https://www.geeksforgeeks.org/minimum-sum-two-numbers-formed-digits-array-2

import java.util.*;

public class MinSum {
    public static void getMinSum(int arr[]) {
        Arrays.sort(arr);

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(int i=0; i < arr.length; i++) {
            if(i % 2 == 0) {
                str1.append(arr[i]);
            } else {
                str2.append(arr[i]);
            }
        }
        
        System.out.println(str1 + " " + str2);

        int num1 = Integer.parseInt(str1.toString());
        int num2 = Integer.parseInt(str2.toString());
        int sum = num1 + num2;

        System.out.println("Minimized Sum : " + sum);
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 0, 7, 4};
        getMinSum(arr);
    }    
}