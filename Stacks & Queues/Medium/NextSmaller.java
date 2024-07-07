// https://www.geeksforgeeks.org/next-smaller-element

import java.util.*;

public class NextSmaller {
    public static void main(String[] args) {
        int arr[] = {4, 8, 5, 2, 25};
        Stack<Integer> s = new Stack<>();
        int newArr[] = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--) {
            while(!s.isEmpty() && s.peek() >= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                newArr[i] = -1;
            } else {
                newArr[i] = s.peek();
            }

            s.push(arr[i]);
        }

        for(int i=0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
