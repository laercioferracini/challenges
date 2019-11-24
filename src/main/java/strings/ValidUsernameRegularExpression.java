package strings;

import java.util.Scanner;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>24/11/2019</pre>
 */
public class ValidUsernameRegularExpression {
    static class UsernameValidator {
        /*
         * Write regular expression here.
         */
        public static final String regularExpression = "([a-zA-Z][\\w]){8,30}";
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

}
