// https://www.geeksforgeeks.org/rabin-karp-algorithm-for-pattern-searching

public class RabinKarpAlgo {
    public static void searchPattern(String t, String p) {
        int idx = t.indexOf(p);

        while(idx != -1) {
            System.out.println("Pattern Found At Index : " + idx);
            idx = t.indexOf(p, idx+1);
        }
    }

    public static void main(String[] args) {
        String t = "AABAACAADAABAABA";
        String p = "AABA";
        searchPattern(t, p);
    }
}
