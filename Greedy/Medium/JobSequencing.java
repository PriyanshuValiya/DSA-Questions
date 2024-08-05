package Greedy.Medium;

// https://www.geeksforgeeks.org/job-sequencing-problem

import java.util.*;

public class JobSequencing {
    public static void getMaxProfit(int deadline[], int profit[]) {
         int jobTable[][] = new int[profit.length][3];
         
         for(int i=0; i < profit.length; i++) {
            jobTable[i][0] = i;
            jobTable[i][1] = deadline[i];
            jobTable[i][2] = profit[i];
         }

        Arrays.sort(jobTable, Comparator.comparingDouble(o -> o[2]));

         int count = 1;
         ArrayList<Integer> arr = new ArrayList<>();
         
         for(int i = jobTable[0].length; i >= 0; i--) {
            if(count <= jobTable[i][1]) {
                arr.add(jobTable[i][0]);
                count++;
            }
         }

         System.out.println(arr);
    }

    public static void main(String[] args) {
        int deadline[] = {4, 1, 1, 1};
        int profit[] = {20, 10, 40, 30};
    
        getMaxProfit(deadline, profit);
    }
}
