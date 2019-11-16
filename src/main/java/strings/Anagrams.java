package strings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>16/11/2019</pre>
 */
public class Anagrams {


    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        java.util.ArrayList<String> stringA = new java.util.ArrayList<>();
        java.util.ArrayList<String> stringB = new java.util.ArrayList<>();
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            stringA.add(String.valueOf(a.charAt(i)));
            stringB.add(String.valueOf(b.charAt(i)));
        }
        stringA.sort(String.CASE_INSENSITIVE_ORDER);
        stringB.sort(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < a.length(); i++) {
            int xa = 0, xb = 0;
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) xa++;
                if (a.charAt(i) == b.charAt(j)) xb++;
            }
            if (xa != xb) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = "anagras";
        String b = "margana";
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}
