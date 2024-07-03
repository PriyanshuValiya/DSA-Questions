// https://www.interviewbit.com/problems/repeat-and-missing-number-array

import java.util.Arrays;

public class ReapeatAndMissingNumber {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 5, 3}; // 1, 2, 3, 3, 5
        int A=0, B=0;

        Arrays.sort(arr);

        for(int i=0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                A = arr[i];
            } 

            if((i+1) != arr[i] && (i+1) != A) {
                B = (i+1);
            }
        }

        System.out.println("A : " + A);
        System.out.println("B : " + B);
    }
}
