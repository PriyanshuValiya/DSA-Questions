// https://www.geeksforgeeks.org/convert-sentence-equivalent-mobile-numeric-keypad-sequence/

import java.util.*;

public class StringToNumber {
    public static String convertToNums(String name, String nums[]) {
        String ans = "";

        for(int i=0; i < name.length(); i++) {
            if(name.charAt(i) == ' ') {
                ans += '0';
            } else {
                int position = name.charAt(i) - 'A';
                ans += nums[position];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        String nums[] = {"2", "22", "222", "3", "33", "333",
                "4", "44", "444", "5", "55", "555",
                "6", "66", "666", "7", "77", "777",
                "7777", "8", "88", "888", "9", "99",
                "999", "9999"};

        String ans = convertToNums(name, nums);
        System.out.println(ans);
    }
}
