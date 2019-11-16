package strings;

import java.util.Scanner;

public class StringReverse {
    /**
     * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
     */

    public static String isPalindrome(String s){
        String reverse = reverseStringArray(s.toCharArray());
        return s.equals(reverse) ? "Yes" : "No";
    }
    public static String reverseStringArray(char[] s){
        if(s.length == 1) return String.valueOf(s);
        char[] reverse = new char[s.length];
        for (int i = s.length -1, j = 0; j<s.length; i--, j++){
            reverse[j] = s[i];
        }
        return String.valueOf(reverse);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        System.out.println(isPalindrome(A));

    }
}
