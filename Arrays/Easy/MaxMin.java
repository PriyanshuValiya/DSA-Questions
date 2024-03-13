// https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
import java.util.*; 

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < n; i++) {
            int curr = arr[i]; 
            int j = i - 1; 
            while(j >= 0 && curr < arr[j]) { 
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }

        System.out.println("Biggest Element : " + arr[0]);
        System.out.println("Smallest Element : " + arr[arr.length-1]);
    }
}
