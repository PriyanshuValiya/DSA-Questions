// https://www.geeksforgeeks.org/space-optimization-using-bit-manipulations

import java.util.Scanner;

public class SpaceOptimize {
    public static void getMultiples(int a, int b) {
        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int size = b - a + 1; // 9
        int arr[] = new int[size];

        for(int i=a; i <= b; i++) { // 0 to 8
            if(i % 2 == 0 || i % 5 == 0) {
                arr[i-a] = 1;
            }
        }

        for(int i=a; i <= b; i++) {
            if(arr[i-a] == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        getMultiples(a, b);
    }
}
