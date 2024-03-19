// https://www.geeksforgeeks.org/zigzag-or-diagonal-traversal-of-matrix

public class ZigzagMatrix {
    public static void getDiogonalMatrix(int arr[][]) {
        int line = 0;
        for(int row=0; row < arr.length; row++) {
            for(int col=0; col < arr[0].length; col++) {
                    if(((row + col) == line)) {
                        System.out.println(arr[row][col] + " " + (row+col));
                        line++;
                    }
                }
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