// https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1

import java.util.*;

public class CelebrityProblem {
    public static void getCelebrity(int m[][]) {
        int arr[] = new int[m.length-1];
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[0].length; j++) {
                if(m[i][j] == 1) {
                    arr[j]++;
                }
            }
        }

        for(int i=0; i < arr.length-1; i++) {
            if(arr[i] < arr[i+1]) {
                System.out.println("Celebrity Element : " + (i+1));
            }
        }
    }
    
    public static void main(String[] args) {
        int m[][] = {
            {0, 1, 0},
            {0, 0, 0},
            {0, 1, 0}
        };

        getCelebrity(m);
    }  
}