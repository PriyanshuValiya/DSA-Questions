// https://leetcode.com/problems/next-permutation/description
// Solution : https://youtu.be/fBX7QVrCscM

public class NextPermutation {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverce(int arr[], int i, int j) {
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 6, 5, 4};
        int i = arr.length-1;
        
        while(i > 0) {
            if(arr[i] > arr[i-1]) {
                i--;
                break;
            }
            i--;
        }

        if(i >= 0) {
            int j;
            for(j = arr.length-1; j >= i+1; j--) {
                if(arr[j] > arr[i]) {
                    break;
                }
            }
            swap(arr, i, j);
        } 

        reverce(arr, i+1, arr.length-1);

        for(int k=0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }    
}