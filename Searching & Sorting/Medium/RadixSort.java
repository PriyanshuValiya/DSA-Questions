// https://www.geeksforgeeks.org/radix-sort
// Not Completed

public class RadixSort {
    public static int getMax(int arr[]) {
        int max = 0;

        for(int i=0; i < arr.length-1; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void countSort(int arr[], int exp) {
        int output[] = new int[arr.length];
        int count[] = new int[10];

        for(int i=0; i < arr.length; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for(int i=1; i < 10; i++) {
            count[i] += count[i-1];
        }

        for(int i=arr.length-1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for(int i=0; i < output.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void radixSort(int arr[]) {
        int max = getMax(arr);
        int i = 1;
        
        while(i > 0) {
            countSort(arr, i);
             i = max/i;
             i *= 10;
        }

        for(int j=0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);
    }
}
