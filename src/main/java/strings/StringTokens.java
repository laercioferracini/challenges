package strings;

import java.util.ArrayList;
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
        String[] result = s.split("((\\s+)|([\\W])*(\\s|\\p{Punct}))");
        ArrayList<String> r = new ArrayList<>();
        for (int i = 0; i<result.length;i++){
            if (!result[i].equals(""))r.add(result[i]);
        }

        System.out.println(r.size());
        fraseDividida = String.valueOf(r.size()).concat("\n");

        return fraseDividida + r.stream()
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
