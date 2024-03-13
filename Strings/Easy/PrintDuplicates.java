// https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string

import java.util.*;

public class PrintDuplicates {
    public static void getDuplicate(String name) {
        int count[] = new int[256];

        for(int i=0; i < name.length(); i++) {
            count[name.charAt(i)] += 1;
        }

        for(int i=0; i < 256; i++) {
            if(count[i] > 1) {
                System.out.println(name.charAt(i) + ", " + count[i]);
            }
        }
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = "geeksforgeeks";
  }  
}