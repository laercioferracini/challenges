package strings;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>20/11/2019</pre>
 */


public class Regex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

}
class MyRegex {

    public String pattern2 = "\\d?\\d?\\d.\\d?\\d?\\d.\\d?\\d?\\d.\\d?\\d?\\d";
    public String pattern3 = "(\\d)?(\\d)?\\d.(\\d)?(\\d)?\\d.(\\d)?(\\d)?\\d.(\\d)?(\\d)?\\d";
    public String pattern4 = "[0-2]?[0-5]?[0-9].[0-2]?[0-5]?[0-9].[0-2]?[0-5]?[0-9].[0-2]?[0-5]?[0-9]";
    public String pattern5 = "(([0-2]?[0-5]?)|([0-1]?[0-9]?))[0-9].(([0-2]?[0-5]?)|([0-1]?[0-9]?))[0-9].(([0-2]?[0-5]?)|([0-1]?[0-9]?))[0-9].(([0-2]?[0-5]?)|([0-1]?[0-9]?))[0-9]";
    public String pattern6 = "(([0-2]?[0-5]?[0-5])|([0-1]?[0-9]?[0-9])).(([0-2]?[0-5]?[0-5])|([0-1]?[0-9]?[0-9])).(([0-2]?[0-5]?[0-5])|([0-1]?[0-9]?[0-9])).(([0-2]?[0-5]?[0-5])|([0-1]?[0-9]?[0-9]))";
    String pattern = "(([0-2]?(([0-4]?[0-9])|([0-5]?[0-5])))|([0-1]?[0-9]?[0-9])).(([0-2]?(([0-4]?[0-9])|([0-5]?[0-5])))|([0-1]?[0-9]?[0-9])).(([0-2]?(([0-4]?[0-9])|([0-5]?[0-5])))|([0-1]?[0-9]?[0-9])).(([0-2]?(([0-4]?[0-9])|([0-5]?[0-5])))|([0-1]?[0-9]?[0-9]))";


}



