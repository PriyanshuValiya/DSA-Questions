// https://www.geeksforgeeks.org/find-the-maximum-repeating-number-in-ok-time

import java.util.*;

public class MaxRepeat {
    public static void getMax(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int maxEle = Integer.MAX_VALUE;
        
        for(int i=0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(int n : map.keySet()) {
            maxFreq = Math.max(maxFreq, map.get(n));
            if(map.get(n) == maxFreq) {
                maxEle = n;
            } 
        }

        System.out.println("Most Freq Element : " + maxEle);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 5, 3, 2, 1, 5};
        getMax(arr);
    }    
}