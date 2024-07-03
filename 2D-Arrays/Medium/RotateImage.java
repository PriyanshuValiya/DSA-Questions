// https://leetcode.com/problems/rotate-image/description

public class RotateImage {
    public static void printMatrix(int matrix[][]) {
        for(int i=0; i < matrix.length; i++) {
            for(int j=0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }       
    }

    public static void rotateMatrix(int matrix[][]) {
        int newMat[][] = new int[matrix.length][matrix[0].length];

        for(int i=0; i < matrix.length; i++) {
            for(int j=0; j < matrix[0].length; j++) {
                newMat[i][j] = matrix[j][i];
            }
        }

        int temp = 0;
        
        for(int i=0; i < matrix.length; i++) {
            temp = newMat[i][0];
            newMat[i][0] = newMat[i][matrix[0].length-1];
            newMat[i][matrix[0].length-1] = temp;
        }

        printMatrix(newMat);
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotateMatrix(matrix);
    }  
}
