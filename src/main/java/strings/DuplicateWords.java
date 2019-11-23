package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>20/11/2019</pre>
 */
public class DuplicateWords {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }

    public static String removeDuplicateWords(String in) {
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";// "(\\b\\w+\\b)(\\s+\\1\\b)+"
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        String input = in;

        Matcher m = p.matcher(input);

        // Check for subsequences of input that match the compiled pattern
        while (m.find()) {
            System.out.printf("%s - %s%n", m.start(), m.group());
            input = input.replaceAll(m.group(), m.group(1)); // m.group().split(" ")[0]
        }

        // returns the modified sentence.
        return input;
    }
}
