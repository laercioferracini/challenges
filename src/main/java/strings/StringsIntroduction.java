package strings;

import java.util.Scanner;

public class StringsIntroduction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        String a, b = "";
        if (A.charAt(0) > B.charAt(0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        a = String.valueOf(A.charAt(0)).toUpperCase().concat(A.substring(1, A.length() - 1));
        b = String.valueOf(B.charAt(0)).toUpperCase().concat(B.substring(1, B.length() - 1));
        System.out.println(a + " " + b);
    }
}
