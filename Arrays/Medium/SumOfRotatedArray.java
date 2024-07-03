// https://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/?ref=lbp

public class SumOfRotatedArray {
    public static void sumOfArray(int arr[], int sum) {
        for(int i=0; i < arr.length; i++) {
            for(int j=i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == sum) {
                    System.out.print("True : " + arr[i] + " " + arr[j]);
                    return;
                }
            }
        }
        System.out.println("False");
    }

    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int sum = 16;
        sumOfArray(arr, sum);
    }
}
