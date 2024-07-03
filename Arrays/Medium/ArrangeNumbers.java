// https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number

import java.util.Arrays;

public class ArrangeNumbers {
    public static void arrangeNumber(int arr[]) {
        StringBuilder str = new StringBuilder();
        String newArr[] = new String[arr.length];

        for(int i=0; i < arr.length; i++) {
            newArr[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(newArr, (a, b) -> (b+a).compareTo(a+b));

        for(int i=0; i < newArr.length; i++) {
            str.append(newArr[i]);
        }

        System.out.println("Max. Number : " + str);
    }

    public static void main(String[] args) {
        int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
        arrangeNumber(arr);
    }
}
