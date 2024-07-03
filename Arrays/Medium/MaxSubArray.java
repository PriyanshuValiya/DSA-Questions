// https://leetcode.com/problems/maximum-product-subarray

public class MaxSubArray {
    public static void getMaxProduct(int arr[]) {
        int maxProduct = 1;

        for(int i=0; i < arr.length-1; i++) {
            int currProduct = arr[i] * arr[i+1];
            maxProduct = Math.max(maxProduct, currProduct);
        }

        System.out.println("Maximum Product : " + maxProduct);
    }

    public static void main(String[] args) {
        int arr[] = {2, -3, 2, 4};
        getMaxProduct(arr);
    }
}
