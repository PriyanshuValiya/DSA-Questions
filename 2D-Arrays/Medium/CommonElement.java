// https://www.geeksforgeeks.org/find-common-element-rows-row-wise-sorted-matrix

import java.util.Arrays;

public class CommonElement {
    public static int getMax(int arr[]) {
        int maxIdx = 0;

        for(int i=0; i < arr.length-1; i++) {
            if(arr[i] > arr[maxIdx]) {
                maxIdx = i;
            } 
        }

        return maxIdx;
    }

    public static void getCommonElement(int arr[][]) {
        int newArr[] = new int[15];

        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[0].length; j++) {
                newArr[arr[i][j]]++;
            }
        }

        int ans = getMax(newArr);
        System.out.println("Most Common Element : " + ans);
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4, 5},
            {2, 4, 5, 8, 10},
            {3, 5, 7, 9, 11},
            {1, 3, 5, 7, 9}
        };

        getCommonElement(arr);
    }
}
