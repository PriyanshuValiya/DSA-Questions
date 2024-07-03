// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

public class BuyAndSellStock {
    public static void getMaxProfit(int arr[]) {
        int maxDiff = 0;

        for(int i=0; i < arr.length-1; i++) {
            for(int j=i+1; j < arr.length; j++) {
                int diff = arr[j] - arr[i];
                maxDiff = Math.max(maxDiff, diff);
            }
        }

        System.out.println("Maximum Profit : " + maxDiff);
    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        getMaxProfit(arr);
    }
}
