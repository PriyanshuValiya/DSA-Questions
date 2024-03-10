import java.util.*;

public class MaxSubarray {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int newArr[] = new int[arr.length];
        int sum = arr[0];

        for(int i=0; i < arr.length-1; i++) {
            if(arr[i+1] > arr[i]) {
                sum += arr[i];
                System.out.println(sum);
                newArr[i] = arr[i];
            }
        }

        for(int i=0; i < 9; i++) {
            System.out.print("\n" + newArr[i] + " ");
        }
        System.out.print("\n" + sum + " ");
    }
}
