package Greedy.Easy;
// https://www.geeksforgeeks.org/greedy-algorithm-to-find-minimum-number-of-coins

import java.util.*;

public class ChangeCoins {
    public static void getChanges(int v) {
        Integer curr[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int count = 0;
        ArrayList<Integer> rupees = new ArrayList<>();

        Arrays.sort(curr, Collections.reverseOrder());

        for(int i=0; i < curr.length; i++) {
            if(curr[i] <= v) {
                while(curr[i] <= v) {
                    v -= curr[i];
                    rupees.add(curr[i]);
                    count++;
                }
            }
        }

        System.out.println("Number Of Coins : " + rupees.size());
        System.out.println(rupees);
    }

    public static void main(String[] args) {
        int v = 141;

        getChanges(v);
    }
}
