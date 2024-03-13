// https://leetcode.com/problems/search-in-rotated-sorted-array

import java.util.*;

class SearchArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements in Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Key You Want to Search : ");
        int key = sc.nextInt();

        for(int i=0; i < arr.length; i++) {
            if(arr[i] == key) {
               System.out.println(key + " Found at " + (i+1) + " in Array"); 
            }
        }
    }
}
