// https://www.geeksforgeeks.org/searching-array-adjacent-differ-k

public class SearchingArray {
    public static void findElement(int arr[], int k, int x) {
        int i = 0;

        while(i < arr.length) {
            System.out.println(arr[i]);
            if(arr[i] == x) {
                System.out.println("Output : " + i);
                break;
            }

            i += Math.max(1, Math.abs(arr[i] - x)/k);
        }
    }

    public static void main(String[] args) {
        int arr[] = {20, 40, 50, 70, 70, 60};
        int k = 20, x = 60;

        findElement(arr, k, x);
    }
}
