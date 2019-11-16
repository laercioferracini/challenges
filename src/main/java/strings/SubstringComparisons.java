package strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> substrings = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (i + k > s.length()) break;
            else substrings.add(s.substring(i, i+k));
        }
        substrings.sort(java.util.Comparator.comparing(String::toString));
        smallest = substrings.get(0);
        largest = substrings.get(substrings.size()-1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
