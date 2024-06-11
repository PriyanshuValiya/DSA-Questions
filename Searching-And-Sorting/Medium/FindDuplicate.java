// https://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space


// Space Complexicity - O(n)

 public class FindDuplicate {
    public static void getDuplicates(int arr[]) {
        int newArr[] = new int[arr.length];

        for(int i=0; i < arr.length; i++) {
            newArr[arr[i]]++;
        }

        System.out.print("Repeate Elements : ");

        for(int i=0; i < newArr.length; i++) {
           if(newArr[i] > 1) {
            System.out.print(i + " ");
           }
        }
    } 

    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 3, 4, 1};
        getDuplicates(arr);
    }
} 


// Space Complexicity - O(1)

/* import java.util.*;

public class FindDuplicate {
    public static void getDuplicates(int arr[]) {
        Arrays.sort(arr);

        System.out.print("Repeate Elements : ");

        for(int i=0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 3, 4, 1};
        getDuplicates(arr);
    }   
} */
