// https://practice.geeksforgeeks.org/problems/longest-subsequence-such-that-difference-between-adjacents-is-one4724/1

import java.util.*;

public class LongSubseqLen {
    public static void getPairs(int arr[]) {
        ArrayList<ArrayList<Integer>> pair = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int max = 0;
    
        for(int i=0; i < arr.length; i++) {
            temp.add(arr[i]);
            for(int j=i+1; j < arr.length; j++) {
                if(Math.abs(arr[j] - temp.get(temp.size()-1)) == 1) {
                    temp.add(arr[j]);
                }
            }

            pair.add(new ArrayList<>(temp));
            temp.clear();
        }

        for(ArrayList<Integer> t : pair) {
            max = Math.max(max, t.size());
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = {10, 9, 4, 5, 4, 8, 6};
        getPairs(arr);
    }    
}