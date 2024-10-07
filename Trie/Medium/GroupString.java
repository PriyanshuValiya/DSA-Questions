// https://www.geeksforgeeks.org/group-shifted-string/
// Not Completed.

import java.util.*;

public class GroupString {
    public static void getGroup(String str[]) {
        ArrayList<ArrayList<String>> arr = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i < str.length; i++) {
            map.put(str[i], str[i].length());
        }

        int count = 1;

        for(String s : map.keySet()) {
            if(count < 4 && s.length() == count) {
                temp.add(s);
                count++;
                arr.add(temp);
            }
        }

        System.out.println(map);
        System.out.println(arr);
    }

    public static void main(String[] args) {
        String str[] = {"acd", "dfg", "wyz", "yab", "mop", "bdfh", "a", "x", "moqs"};
        getGroup(str);
    } 
}