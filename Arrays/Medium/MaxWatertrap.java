// https://leetcode.com/problems/container-with-most-water

public class MaxWatertrap {
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int leftBar = 0;
        int rightBar = arr.length-1;

        while(leftBar < rightBar) {
            int currArea = (Math.min(arr[leftBar], arr[rightBar])) * (rightBar - leftBar);
            maxArea = Math.max(maxArea, currArea);
            
            if(arr[leftBar] < arr[rightBar]) {
                leftBar++;
            } else {
                rightBar--;
            }
        }

        System.out.println("Maximum Water : " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        maxArea(arr);
    }
}
