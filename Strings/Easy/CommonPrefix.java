// https://leetcode.com/problems/longest-common-prefix

import java.util.*;

public class CommonPrefix {
    public static String getSmallest(String arr[]) {
        String smallName = arr[0];

        for(int i=1; i < arr.length-1; i++) {
            if(arr[i].compareTo(smallName) < 0) {
                smallName = arr[i];
            }
        }
        return smallName;
    }

    public static String longestCommonPrefix(String arr[], StringBuilder newStr) {
        String smallest = getSmallest(arr);
        for(int i=0; i < smallest.length(); i++) {
            if(arr[0].charAt(i) != arr[arr.length-1].charAt(i)) {
                return newStr.toString();
            } else {
                newStr.append(arr[0].charAt(i));
            }
        } 
        return newStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Names : ");
        int n = sc.nextInt();
        String arr[] = new String[n];

        for(int i=0; i < n; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr);

        String ans = longestCommonPrefix(arr, new StringBuilder(""));
        System.out.println(ans);
    }
}
