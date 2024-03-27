// https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1

public class CountInversions {
    public static int min(int arr[]) {
        int min = arr[0];
        for(int i=0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void countInversion(int arr[]) {
        int count = 0;

        for(int i=0; i < arr.length-1; i++) {
           for(int j=i+1; j < arr.length; j++) {
                if(arr[i] - arr[j] > 0) {
                    System.out.print("(" + arr[i] + "," + arr[j] + "), ");
                    count++;
                }
           }
        }

        System.out.println("\nCount : " + count);
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 2, 1, 5, 4};
        countInversion(arr);
    }
}
