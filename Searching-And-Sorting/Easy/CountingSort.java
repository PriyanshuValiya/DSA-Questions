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
        int arr[] = {2, 5, 3, 0, 2, 3, 0, 3};  
        int countArr[] = new int[max(arr) + 1];
        int outputArr[] = new int[arr.length];

        for(int i=0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }

        for(int i=1; i < countArr.length; i++) {
            countArr[i] += countArr[i-1];
        }

        for(int i=arr.length-1; i >= 0; i--) {
            outputArr[countArr[arr[i]] - 1] = arr[i];
            countArr[arr[i]]--;
        }

        for(int i=0; i < outputArr.length; i++) {
            System.out.print(outputArr[i] + " ");
        }
    }
}