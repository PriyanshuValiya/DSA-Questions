// https://leetcode.com/problems/longest-repeating-character-replacement
// https://youtu.be/RgrpmWzkGYY?si=vSQVNg3jph6oeX4x

public class LongestRepeatingChars {
    public static void characterReplacement(String str, int k) {
        int map[] = new int[26];
        int max = 0;
        int result = 0;
        int ptr = 0;

        for(int i=0; i < str.length(); i++) {
            map[str.charAt(i) - 'A']++;
            max = Math.max(max, map[str.charAt(i) - 'A']);
            if(i - ptr + 1 - max > k) {
                map[str.charAt(ptr) - 'A']--;
                ptr++;
            }
            result = Math.max(result, i - ptr + 1);
        }

        System.out.println("Output : " + result);
    }

    public static void main(String[] args) {
        String str = "AABABBA";
        int k = 1;
        characterReplacement(str, k);
    }
}
