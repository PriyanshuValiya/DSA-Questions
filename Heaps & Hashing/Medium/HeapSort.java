// https://www.geeksforgeeks.org/heap-sort/

public class HeapSort {
    public static void heapify(int arr[], int i, int size) {
        int left = (2 * i) + 1;
        int rigth = (2 * i) + 2;
        int maxIdx = i;

        if(left < size && arr[maxIdx] < arr[left]) {
            maxIdx = left;
        }

        if(rigth < size && arr[maxIdx] < arr[rigth]) {
            maxIdx = rigth;
        }

        if(maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    public static void heapSort(int arr[]) {
        int n = arr.length;

        for(int i = n/2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        for(int i = n-1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 1, 3};
         
        heapSort(arr);

        for(int i=0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
        }
    }   
}