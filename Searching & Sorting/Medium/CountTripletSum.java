// https://www.geeksforgeeks.org/count-triplets-with-sum-smaller-than-a-given-value

public class CountTripletSum {
    public static void countTriplets(int arr[], int sum) {
        int count = 0;

        for(int i=0; i < arr.length-2; i++) {
            for(int j=i+1; j < arr.length-1; j++) {
                for(int k=j+1; k < arr.length; k++) {
                    int ans = arr[i] + arr[j] + arr[k];
                    if(ans == sum) {
                        count++;
                        System.out.println("Number Of Solutions : " + count);
                        System.out.print("Pairs : (" + arr[i] + "," + arr[j] + "," + arr[k] + ")");
                    }
                }
            }
        }
    }
 
    public static void main(String[] args) {
        int arr[] = {-2, 0, 1, 3};
        int sum = 2;
        countTriplets(arr, sum);
    }
}
