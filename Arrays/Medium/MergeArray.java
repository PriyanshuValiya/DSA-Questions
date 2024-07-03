// https://www.geeksforgeeks.org/merging-intervals
// Remaining Part : Add Last Element of arr ({11, 15}) in newArr.

public class MergeArray {
    public static void mergeArray(int arr[][]) {
        int newArr[][] = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               if(arr[i][1] > arr[i+1][0]) {
                newArr[i][0] = arr[i][0];
                newArr[i][1] = arr[i+1][1];
                arr[i+1][j] = 0;
               } else {
                newArr[i][j] = arr[i][j];
               }
            }
        }

        for (int i = 0; i < newArr.length-1; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                if(arr[i][j] != 0) {
                    System.out.print(newArr[i][j] + " ");
                }
            }System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {2, 4}, {6, 8}, {7, 10}, {11, 15}};
        mergeArray(arr);
    }
}
