// https://www.geeksforgeeks.org/permute-two-arrays-sum-every-pair-greater-equal-k

import java.util.*;

public class PermuteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {3, 4, 2, 1};
        int b[] = {7, 8, 5, 6};
        System.out.print("Enter Your Key : ");
        int key = sc.nextInt();


        for(int i=0; i < a.length; i++) {
            for(int j=0; j < a.length-1-i; j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for(int i=0; i < b.length; i++) {
            for(int j=0; j < b.length-1-i; j++) {
                if(b[j] < b[j+1]) {
                    int temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }

        for(int i=0; i < a.length; i++) {
            if(key == a[i] + b[i]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            break;
        }
    }
}
