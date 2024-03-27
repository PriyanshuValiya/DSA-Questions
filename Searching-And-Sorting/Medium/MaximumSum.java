// https://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent

public class MaximumSum {
    public static void maxSum(int arr[]) {
        int sum = arr[0];
        int i = 0;

        while(i < arr.length-1) {
            if (arr[i] > arr[i+1] && i == arr.length-3) {
                sum += arr[i] + arr[arr.length-1];
                break;
            } 

            if(i != 0 && arr[i] > arr[i+1]) {
                sum += arr[i];
                i++;
            }
            i++;
        }               
         System.out.println("Sum : " + sum);
    }

    public static void main(String[] args) {
        int arr[] = {5, 5, 10, 100, 10, 5};
        int arr2[] = {3, 2, 10, 5, 7, 5}; 
        maxSum(arr);
        maxSum(arr2);
    }
}
