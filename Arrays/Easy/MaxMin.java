// https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
import java.util.*; 

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        for(int i=0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Biggest Element : " + max);
        System.out.println("Smallest Element : " + min);
    }
}
