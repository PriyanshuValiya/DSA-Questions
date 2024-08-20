// https://www.geeksforgeeks.org/next-greater-element

import java.util.*;

public class NextGreaterEle {
    public static void nextGreaterEle(int arr[]) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        ArrayList<Integer> nums = new ArrayList<>();
        
        for(int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        for(int n : map.keySet()) {
            nums.add(n);
        }

        System.out.println(nums);
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 25};
        nextGreaterEle(arr);
    }   
}