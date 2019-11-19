package strings;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>16/11/2019</pre>
 */
public class StringTokens {

    public static String dividirFrase(String s) {
        String fraseDividida = "";
        String[] result = s.split(Pattern.compile("[_\\@!?.', ]").pattern());
        System.out.println(result.length);
        fraseDividida = String.valueOf(result.length).concat("\n");

        return fraseDividida + Arrays.stream(result)
                .flatMap(String::lines)
                .collect(Collectors.joining("\n"));
    }

    public static void dividirFraseToken(String s) {
        StringTokenizer st = new StringTokenizer(s, ("[_\\@!?.', ]"));
        int x = st.countTokens();
        System.out.println(x);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

}
