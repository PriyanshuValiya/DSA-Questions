// https://leetcode.com/problems/contains-duplicate/

import java.util.*;

public class ContainsDuplicate {
    public static void checkDuplicate(int arr[]) {
       Arrays.sort(arr); 
       int count = 0;

       for(int i=0; i < arr.length-1; i++) {
        for(int j=0; j < arr.length-1-i; j++) {
            if(arr[j] == arr[j+1]) {
                count++;
            }
        }
       }

       if(count != 0) {
        System.out.println("True");
       } else {
        System.out.println("False");
       }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,3,2,4,2};
        checkDuplicate(arr);
    }
}