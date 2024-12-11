// https://leetcode.com/problems/spiral-matrix/description

import java.util.*;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;
        List<Integer> ans = new ArrayList<>();

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                ans.add(matrix[startRow][i]);
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                ans.add(matrix[i][endCol]);
            }

            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) {
                    ans.add(matrix[endRow][i]);
                }
            }

            if (startCol < endCol) {
                for (int i = endRow - 1; i >= startRow + 1; i--) {
                    ans.add(matrix[i][startCol]);
                }
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };

        System.out.println(spiralOrder(matrix));
    }
}
