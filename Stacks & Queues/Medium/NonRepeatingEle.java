// https://www.geeksforgeeks.org/queue-based-approach-for-first-non-repeating-character-in-a-stream

import java.util.*;

public class NonRepeatingEle {
    public static void getNonRepeatingEle(String str) {
        Queue<Character> q = new LinkedList<>();
        int map[] = new int[26];

        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            map[ch - 'a']++;

            while(!q.isEmpty() && map[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if(q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabc";
        getNonRepeatingEle(str);
    }
}
