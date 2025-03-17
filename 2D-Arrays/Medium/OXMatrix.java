// https://www.geeksforgeeks.org/create-a-matrix-with-alternating-rectangles-of-0-and-x

public class OXMatrix {
  public static void printMatrix(Character matrix[][]) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void makeMatrix(int m, int n) {
    Character matrix[][] = new Character[m][n];
    int startRow = 0, endRow = m - 1;
    int startCol = 0, endCol = n - 1;
    Character ch = 'X';

    while (startRow <= endRow && startCol <= endCol) {
      for (int j = startCol; j <= endCol; j++) {
        matrix[startRow][j] = ch;
      }

      for (int i = startRow + 1; i <= endRow; i++) {
        matrix[i][endCol] = ch;
      }

      for (int j = endCol - 1; j >= startCol; j--) {
        matrix[endRow][j] = ch;
      }

      for (int i = endRow - 1; i >= startRow + 1; i--) {
        matrix[i][startCol] = ch;
      }
      
      startRow++;
      startCol++;
      endRow--;
      endCol--;

      if (ch == 'X') {
        ch = 'O';
      } else {
        ch = 'X';
      }
    }

    printMatrix(matrix);
  }

  public static void main(String[] args) {
    int m = 6, n = 7;
    makeMatrix(m, n);
  }
}
