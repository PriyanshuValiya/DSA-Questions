package Greedy.Medium;

// https://leetcode.com/problems/merge-intervals/

import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        int activity[][] = new int[intervals.length][3];

        for(int i = 0; i < intervals.length; i++) {
            activity[i][0] = i;
            activity[i][1] = intervals[i][0];
            activity[i][2] = intervals[i][1];
        }

        Arrays.sort(activity, Comparator.comparingDouble(o -> o[1]));

        int prevEnd = activity[0][2];
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();

        row.add(activity[0][1]);

        for(int i=1; i < activity.length; i++) {
            if(activity[i][1] > prevEnd) {
                row.add(prevEnd);
                arr.add(row);
                row = new ArrayList<>();
                row.add(activity[i][1]);
                prevEnd = activity[i][2];
            } else {
                if(activity[i][2] > prevEnd) {
                  prevEnd = activity[i][2];
                }
            }
        }

        row.add(prevEnd);
        arr.add(row);

        int[][] array = new int[arr.size()][];
        
        for (int i = 0; i < arr.size(); i++) {
            ArrayList<Integer> newArr = arr.get(i);
            array[i] = new int[newArr.size()];
            for (int j = 0; j < newArr.size(); j++) {
                array[i][j] = newArr.get(j);
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {2 ,6}, {8, 10}, {15, 18}};

        int newArr[][] = merge(arr);

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
