// https://leetcode.com/problems/word-search/description
// Not Able To Pass All Cases.

public class WordSearch {

    public static void makeWord(char arr[][], String word, int i, int j, int idx) {
        if (i == arr.length || j == arr[0].length) {
            System.out.println(word + " is exist in given Word Matrix");
        } else if (idx == word.length()) {
            System.out.println(word + " is exist in given Word Matrix");
        }

        if (word.charAt(idx) == arr[i][j]) {
            makeWord(arr, word, i, j + 1, idx + 1);
            makeWord(arr, word, i + 1, j, idx + 1);
        }
    }

    public static void main(String[] args) {
        String word = "ASADFCSE";
        char arr[][] = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        makeWord(arr, word, 0, 0, 0);
    }
}
