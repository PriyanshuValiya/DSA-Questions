// https://practice.geeksforgeeks.org/problems/consecutive-elements2306/1

import java.util.*;

public class RemoveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder name = new StringBuilder(sc.next());

        for(int i=0; i <= name.length()-2; i++) {
            if(name.charAt(i) == name.charAt(i+1)) {
                name.delete(i, i+1);
            }
        }
        
        System.out.println(name);
    }  
}