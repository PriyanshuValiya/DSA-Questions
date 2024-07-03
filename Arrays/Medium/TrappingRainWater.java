// https://leetcode.com/problems/trapping-rain-water
// Alpha/Arrays/13.17

public class TrappingRainWater {
    public static void trapRainWater(int arr[]) {
        int width = 1;

        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];

        for(int i=1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        int rightMax[] = new int[arr.length];
        rightMax[arr.length - 1] = arr[arr.length - 1];

        for(int i=arr.length-2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int trappedWater = 0;

        for(int i=0; i < arr.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - arr[i]) * width; 
        }

        System.out.println("Total Trapped Water : " + trappedWater);
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        trapRainWater(arr);
    }   
}
