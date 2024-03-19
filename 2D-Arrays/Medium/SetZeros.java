// https://leetcode.com/problems/set-matrix-zeroes

public class SetZeros {
    public static void printMatrix(int matrix[][]) {
        for(int i=0; i < matrix.length; i++) {
            for(int j=0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }          
    }

    public static void getZeros(int matrix[][]) {
        boolean rowFlag = false, colFlag = false;

        for(int i=0; i < matrix.length; i++) {
            for(int j=0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    if(i == 0) rowFlag = true;
                    if(j == 0) colFlag = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
               }
            }
        }

        for(int i=1; i < matrix.length; i++) {
            for(int j=1; j < matrix[0].length; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(rowFlag) {
            for(int i=0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        if(colFlag) {
            for(int j=0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        printMatrix(matrix);
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 1, 1, 1},
            {1, 0, 0, 1},
            {1, 1, 1, 1}
        };
        getZeros(matrix);
    }
}
