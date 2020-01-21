package varargs;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>21/01/2020</pre>
 */

class Add {
    void add(int... n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
            if (i == n.length - 1) System.out.printf("%d", n[i]);
            else System.out.printf("%d+", n[i]);
        }

        System.out.printf("=%d%n", sum);
    }
}

public class SimpleAddition {
    public static void main(String[] args) {
        try {
            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = 1;//Integer.parseInt(br.readLine());
            int n2 = 2;//Integer.parseInt(br.readLine());
            int n3 = 3;//Integer.parseInt(br.readLine());
            int n4 = 4;//Integer.parseInt(br.readLine());
            int n5 = 5;//Integer.parseInt(br.readLine());
            int n6 = 6;//Integer.parseInt(br.readLine());
            Add ob = new Add();
            ob.add(n1, n2);
            ob.add(n1, n2, n3);
            ob.add(n1, n2, n3, n4, n5);
            ob.add(n1, n2, n3, n4, n5, n6);
            Method[] methods = Add.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
