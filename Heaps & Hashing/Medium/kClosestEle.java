// https://www.geeksforgeeks.org/find-k-closest-elements-given-value

import java.util.*;

public class kClosestEle {
    public static void getClosestEle(int arr[], int k, int x) {
        ArrayList<Integer> nums = new ArrayList<>();
        int leftPtr = -1;
        int rightPtr = -1;

        for(int i=0; i < arr.length; i++) {
            if(arr[i] == x) {
                leftPtr = i-1;
                rightPtr = i+1;

                for(int j=0; j < k; j++) {
                    if(Math.abs(arr[leftPtr] - arr[i]) < Math.abs(arr[rightPtr] - arr[i])) {
                        nums.add(arr[leftPtr]);
                        leftPtr--;
                    } else {
                        nums.add(arr[rightPtr]);
                        rightPtr++;
                    }
                }
            }
        }

        System.out.println(nums);
    }

    public static void main(String[] args) {
        int k = 4;
        int x = 35;
        int arr[] = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
        getClosestEle(arr, k, x);
    }  
}