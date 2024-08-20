import java.util.*;

public class AnagramProblem {
    public static void getAnagrams(String words[]) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String word : words) {
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);
            String sortedWord = new String(charArr);

            if(!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        for(ArrayList<String> group : map.values()) {
            System.out.println(group);
        }
    }

    public static void main(String[] args) {
        String words[] = {"act", "god", "cat", "dog", "tac"};
        getAnagrams(words);
    }  
}
