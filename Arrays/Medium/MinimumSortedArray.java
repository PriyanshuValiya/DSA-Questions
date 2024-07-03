// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description

public class MinimumSortedArray {
    public static void findMin(int arr[]) {
        int startIdx = 0;
        int endIdx = arr.length-1;

        while(startIdx < endIdx) {
            int mid = (startIdx + endIdx) / 2;
            if(arr[mid] < arr[endIdx]) {
                endIdx = mid;
            } else {
                startIdx = mid + 1;
            }
        }

        System.out.println("Smallest Number : " + arr[startIdx]);
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        findMin(arr);
    }
}
