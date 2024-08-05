package Greedy.Medium;

// https://www.geeksforgeeks.org/paper-cut-minimum-number-squares

import java.util.*;

public class PapercutProblem {
    public static void getSquare(int height, int width) {
        ArrayList<Integer> arr = new ArrayList<>();

        while(height != 0 && width != 0) {
            if(height > width) {
                height -= width;
                arr.add(width);
            } else {
                width -= height;
                arr.add(height);
            }
        }

        System.out.println("Number Of Paper Pices : " + arr.size());
        System.out.println(arr);
    }

    public static void main(String[] args) {
        int height = 29;
        int width = 13;

        getSquare(height, width);
    }
}
