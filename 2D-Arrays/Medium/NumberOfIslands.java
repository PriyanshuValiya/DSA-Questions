// https://www.geeksforgeeks.org/find-the-number-of-islands-using-dfs

public class NumberOfIslands {
    public static void findIslands(int arr[][], int row, int col) {
        if (row < 0 || col < 0 || row >= arr.length || col >= arr[0].length || arr[row][col] == 0) {
            return;
        }

        arr[row][col] = 0;

        findIslands(arr, row + 1, col);
        findIslands(arr, row - 1, col);
        findIslands(arr, row, col + 1);
        findIslands(arr, row, col - 1);
        findIslands(arr, row + 1, col + 1);
        findIslands(arr, row + 1, col - 1);
        findIslands(arr, row - 1, col + 1);
        findIslands(arr, row - 1, col - 1);
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 1 },
                { 1, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 0 }
        };

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    findIslands(arr, i, j);
                    count++;
                }
            }
        }

        System.out.println("Total Islands: " + count);
    }
}

/*
 * 00 01 02 03 04 05
 * 10 11 12 13 14 15
 * 20 21 22 23 24 25
 * 30 41 32 33 34 35
 * 40 41 42 43 44 45
 * 50 51 52 53 54 55
 */