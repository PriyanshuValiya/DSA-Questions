// https://practice.geeksforgeeks.org/problems/wildcard-string-matching1126/1

public class WildcardString {
    public static void wildString(String pattern, String wild) {
        if(pattern.length() == wild.length()) {
            for(int i=0; i < wild.length(); i++) {
                if(pattern.charAt(i) == wild.charAt(i) || wild.charAt(i) == '*' || wild.charAt(i) == '?') {
                    if(i == wild.length()-1) {
                        System.out.println("Yes");
                    }
                } else {
                    System.out.println("No");
                    break;
                }
            }
        } else if (pattern.length() > wild.length()+1) {
            for(int i=0; i < wild.length(); i++) {
                if(pattern.charAt(i) == wild.charAt(i) || ((wild.charAt(i) == '*' || wild.charAt(i) == '?') && (wild.charAt(wild.length()-1) == '*'))) {
                    if(i == wild.length()-1) {
                        System.out.println("Yes");
                    }
                } else {
                    System.out.println("No");
                    break;
                }
            }
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        String pattern = "geeksforgeeks";
        String wild = "ge?ks*";
        wildString(pattern, wild);
    }
}

/*
 if both length are same.
  - whereever '*' and all chars are same return yes.
if pattern > wild 
  - all chars are same and '*' at end of wild, return yes.
  - all chars are same and '?' at end of wild, return no.
  - all chars are same and whereever '*' or '?' return yes.
if wild > pattern 
  - return no. 
*/