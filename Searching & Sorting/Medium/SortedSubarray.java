// https://www.geeksforgeeks.org/check-reversing-sub-array-make-array-sorted
// Not Complited.

public class SortedSubarray {
    public static void getSortedSubarray(int arr[]) {
        for(int i=0; i < arr.length-1; i++) {
            for(int j=i+1; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 4, 3};
        getSortedSubarray(arr);
    }
}
