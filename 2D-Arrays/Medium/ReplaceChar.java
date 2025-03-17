// https://www.geeksforgeeks.org/given-matrix-o-x-replace-o-x-surrounded-x

public class ReplaceChar { 
    public static void printArray(Character arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void dfs(Character arr[][], int row, int col) {
        if (row < 0 || col < 0 || row >= arr.length || col >= arr[0].length || arr[row][col] != 'O') {
            return;
        }

        arr[row][col] = '#';

        dfs(arr, row + 1, col);
        dfs(arr, row - 1, col);
        dfs(arr, row, col + 1);
        dfs(arr, row, col - 1);
    }

    public static void replaceChar(Character arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == 0 || j == 0 || i == rows - 1 || j == cols - 1) && arr[i][j] == 'O') {
                    dfs(arr, i, j);
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 'O') {
                    arr[i][j] = 'X';
                } else if (arr[i][j] == '#') {
                    arr[i][j] = 'O';
                }
            }
        }
    }

    public static void main(String[] args) {
        Character arr[][] = {
                { 'X', 'O', 'X', 'X', 'X', 'X' },
                { 'X', 'O', 'X', 'X', 'O', 'X' },
                { 'X', 'X', 'X', 'O', 'O', 'X' },
                { 'O', 'X', 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'O', 'X', 'O' },
                { 'O', 'O', 'X', 'O', 'O', 'O' }
        };

        System.out.println("Original Matrix:");
        printArray(arr);

        replaceChar(arr);

        System.out.println("\nModified Matrix:");
        printArray(arr);
    }
}