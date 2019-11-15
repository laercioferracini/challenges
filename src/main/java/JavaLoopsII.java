import java.util.ArrayList;
import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Integer> resultados;
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            resultados = new ArrayList<>(n);
            resultados.add(a + 1 * b);
            for (int x = 1; x < n; x++) {
                resultados.add((int) (resultados.get(x - 1) + Math.pow(2, x) * b));
            }
            resultados.forEach(result -> System.out.printf("%d ", result));
            System.out.println();
        }
        in.close();
    }
}
