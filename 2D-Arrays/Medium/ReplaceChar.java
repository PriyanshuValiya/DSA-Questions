// https://www.geeksforgeeks.org/given-matrix-o-x-replace-o-x-surrounded-x

public class ReplaceChar {
    public static void printArray(Character arr[][]) {
        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void replaceChar(Character arr[][], int row, int col) {
       if(arr[--row][col] == 'X') {
        arr[++row][col] = 'X';
       } 
    }

    public static void main(String[] args) {
        Character arr[][] = {
            {'X', 'O', 'X', 'X', 'X', 'X'},
            {'X', 'O', 'X', 'X', 'O', 'X'},
            {'X', 'X', 'X', 'O', 'O', 'X'},
            {'O', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'O', 'X', 'O'},
            {'O', 'O', 'X', 'O', 'O', 'O'}
        };

        for(int i=1; i < arr.length-1; i++) {
            for(int j=1; j < arr[0].length-1; j++) {
                if(arr[i][j] == 'O') {
                    replaceChar(arr, i, j);
                }
            }
        }

        printArray(arr);
    }
}
