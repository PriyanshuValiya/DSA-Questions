// https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string
// Not Completed :(


import java.util.*;

public class PrintDuplicates {
    public static void getDuplicate(String name) {
        char arr[] = name.toCharArray();
        Arrays.sort(arr);
        int counts[] = new int[arr.length];
        int count = 1;

        for(int i=0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                System.out.println(arr[i] + " " + count);
                count++;
            } else {
                count = 1;
                System.out.println(arr[i] + " " + count);
                count++;
                counts[i] += 1;
            }
            System.out.print(counts[i] + " ");
        }
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = "geeksforgeeks";
    getDuplicate(name);
  }  
}