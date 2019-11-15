package warmUpChallenges;

public class RepeatedString {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long quantidade = n / s.length();
        long resto = n % s.length();
        if (!s.contains("a")) return 0;

        return s.length() > n ? contagem(s, resto) : quantidade * contagem(s, s.length()) + contagem(s, resto);
    }

    private static long contagem(String s, long resto) {
        int a = 0;
        for (int i = 0; i < resto; i++) {
            if (s.charAt(i) == 'a') a++;
        }
        return a;
    }
}
