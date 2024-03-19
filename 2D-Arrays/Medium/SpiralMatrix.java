// https://leetcode.com/problems/spiral-matrix/description

public class SpiralMatrix {
    public static void getSpriral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            // Top Line
            for(int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Right Line
            for(int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Bottom Line
            for(int j=endCol-1; j >= startCol; j--) {
                System.out.print(matrix[endCol][j] + " ");
            } 

            // Left Line
            for(int i=endRow-1; i >= startRow+1; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        getSpriral(matrix);
    }
}
