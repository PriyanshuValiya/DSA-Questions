// https://www.geeksforgeeks.org/problems/unique-rows-in-boolean-matrix/1

import java.util.*;

public class UniqueRow {
    public static void getUnique(int mat[][]) {
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();

        for(int i=0; i < mat.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            
            for(int j=0; j < mat[0].length; j++) {
                temp.add(mat[i][j]);
            }

            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        for(ArrayList<Integer> ans: map.keySet()) {
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1, 1, 0, 1},
            {1, 0, 0, 1},
            {1, 1, 0, 1}
        };

        getUnique(mat);
    }    
}
