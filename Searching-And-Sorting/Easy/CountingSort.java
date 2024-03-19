// https://www.geeksforgeeks.org/counting-sort

public class CountingSort {
    public static int max(int arr[]) {
        int max = arr[0];
        for(int i=1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 10, 9, 2, 4, 9, 7};  
        int countArr[] = new int[max(arr) + 1];


        for(int i=0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }

        int idx = 0;
        for(int i=0; i <= max(arr) + 1; i++) {
            while (countArr[i] > i) {
                arr[idx] = i;
                idx++;
                countArr[i]--;
            }
        }

        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}