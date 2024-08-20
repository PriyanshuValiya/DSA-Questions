// https://www.geeksforgeeks.org/k-th-smallest-element-removing-integers-natural-numbers

import java.util.*;

public class MinElement {
    public static void getMin(int arr[], int k) {
        Arrays.sort(arr);
        ArrayList<Integer> nums = new ArrayList<>();

        int lastEle = arr[arr.length-1];

        for(int i=1; i < lastEle + k; i++) {
            nums.add(i);
        }

        for(int i=0; i < arr.length; i++) {
            nums.remove(i);
        }

        System.out.println("Kth Smallest Element : " + nums.get(k-1));
    }

    public static void main(String[] args) {
        int arr[] = {1, 3};
        int k = 4;
        getMin(arr, k);
    }    
}