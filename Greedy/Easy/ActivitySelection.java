package Greedy.Easy;
// https://www.geeksforgeeks.org/activity-selection-problem-greedy-algo-1

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        int totalTask = 1;
        int prevEnd = end[0];

        for(int i=1; i < end.length; i++) {
            if(start[i] >= prevEnd) {
                totalTask++;
                prevEnd = end[i];
            }
        }

        System.out.println("Total Tasks : " + totalTask);
    }
}
