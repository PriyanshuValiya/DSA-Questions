// https://www.geeksforgeeks.org/find-minimum-number-of-merge-operations-to-make-an-array-palindrome

public class MergePalindrome {
    public static void mergePalindrome(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int mergeCount = 0;

        while (left <= right) {
            if(arr[left] == arr[right]) {
                left++;
                right--;
            } else if(arr[left] > arr[right]) {
                right--;
                mergeCount++;
            } else {
                left++;
                mergeCount++;
            }
        }

        System.out.println("Total Merge Number : " + mergeCount);
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 1};
        mergePalindrome(arr);
    }
}
