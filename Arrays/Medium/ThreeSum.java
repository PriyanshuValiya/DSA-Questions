// https://leetcode.com/problems/3sum/

import java.util.Arrays;

public class ThreeSum {
    public static void threeSum(int arr[]) {
        Arrays.sort(arr);

        for(int i=0; i < arr.length; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            
            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0) {
                    System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        threeSum(arr);
    }
}
