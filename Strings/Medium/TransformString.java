// https://www.geeksforgeeks.org/transform-one-string-to-another-using-minimum-number-of-given-operation

public class TransformString {
    public static void getCount(String A, String B) {
        Character temp = null;
        int count = 0;

        for(int i=A.length()-1; i >= 0; i--) {
            if(A.charAt(i) != B.charAt(i)) {
                temp = A.charAt(i);
                A = A.substring(0, i) + A.substring(i+1);
                A = temp + A;
                count++;
                System.out.println(count + " " + A);
                i = A.length() - 1;
            }
        }
        System.out.println("Total Count : " + count);
    }

    public static void main(String[] args) {
        String A = "EACBD";
        String B = "EABCD";
        getCount(A, B);
    }
}
