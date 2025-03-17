// https://www.geeksforgeeks.org/find-common-element-rows-row-wise-sorted-matrix

import java.util.*;

public class CommonElement {
    public static int findCommonElement(int arr[][]) {
        Map<Integer, Integer> map = new HashMap<>();
        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            map.put(arr[0][j], 1);
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (map.containsKey(arr[i][j]) && map.get(arr[i][j]) == i) {
                    map.put(arr[i][j], map.get(arr[i][j]) + 1);
                }
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) == rows) {
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[][] = {
            { 1, 2, 3, 4, 5 },
            { 2, 4, 5, 8, 10 },
            { 3, 5, 7, 9, 11 },
            { 1, 3, 5, 7, 9 }
        };

        int result = findCommonElement(arr);
        if (result != -1) {
            System.out.println("Common Element: " + result);
        } else {
            System.out.println("No Common Element Found");
        }
    }
}
