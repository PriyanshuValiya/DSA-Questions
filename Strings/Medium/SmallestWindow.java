// https://www.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1
// Not Completed: Try This With Hash Or Map.

public class SmallestWindow {
    public static void getSmallestWindow(String str1, String str2) {
        String newStr = "";

        for(int i=0; i < str1.length(); i++) {
            if(str1.charAt(i) == 't' || str1.charAt(i) == 'o' || str1.charAt(i) == 'c') {
                newStr += str1.charAt(i);
            }
        }

        System.out.println(newStr);
    }

    public static void main(String[] args) {
        String str1 = "timetopractice";
        String str2 = "toc";
        getSmallestWindow(str1, str2);
    }
}
