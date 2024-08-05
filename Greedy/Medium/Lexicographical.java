package Greedy.Medium;

// https://www.geeksforgeeks.org/lexicographically-smallest-array-k-consecutive-swaps

public class Lexicographical {
    public static void getSmallestArr(int arr[], int k) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1 && k > 0; i++) {
            // Find the smallest element within the next k elements
            int pos = i;
            for (int j = i + 1; j < n && j <= i + k; j++) {
                if (arr[j] < arr[pos]) {
                    pos = j;
                    System.out.println(pos);
                }
            }
      }
    }

    public static void main(String[] args) {
        int arr[] = {7, 6, 9, 2, 1};
        int k = 3;

        getSmallestArr(arr, k);
    }
}
