// https://www.geeksforgeeks.org/problems/set-bits0143/1

public class CountSetbits {
    public static void countSetbits(int n) {
        int count = 0;

        while (n > 0) {
            // This operation reduces the number by turning off the rightmost set bit
            // 110 -> 010 -> 000
            n &= (n - 1);
            count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        int n = 6;
        countSetbits(n);
    }
}