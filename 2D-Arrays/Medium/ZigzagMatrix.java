// https://www.geeksforgeeks.org/zigzag-or-diagonal-traversal-of-matrix

public class ZigzagMatrix {
    public static void getDiogonalMatrix(int arr[][]) {
        int n = arr.length, idx = 0;
        int newArr[] = new int[n*n];

        for(int i=0; i < n; i++) {
            int row = i, col = 0;
            while(row >= 0) {
                newArr[idx] = arr[row][col];
                System.out.print(newArr[idx] + " ");
                row--;
                col++;
                idx++;
            }
            System.out.println();
        }

        for(int i=1; i < n; i++) {
            int row = n-1, col = i;
            while(col < n) {
                newArr[idx] = arr[row][col];
                System.out.print(newArr[idx] + " ");
                row--;
                col++;
                idx++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
            { 1, 2, 3, 4 },    
            { 5, 6, 7, 8 }, 
            { 9, 10, 11, 12 },  
            { 13, 14, 15, 16 }, 
        };
        getDiogonalMatrix(arr);
    }  
}

/*
00 01 02 03
10 11 12 13
20 21 22 23
30 31 32 33
*/