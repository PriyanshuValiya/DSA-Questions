// https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1

import java.util.*;

public class NextGreater {
    public static void main(String args[]) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreat[] = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--) {
            while(!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                nxtGreat[i] = -1;
            } else {
                nxtGreat[i] = s.peek();
            }
            
            s.push(arr[i]);
        }

        for(int i=0; i<nxtGreat.length; i++) {
            System.out.print(nxtGreat[i] + " ");
        } 
    }
}