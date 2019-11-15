package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        /**
         * Each time I read an element of the array from the input, I directly assign it to the array at the speific index after shifting. d left rotations equal (n-d) right rotations. The array has a size of n, so when the index (i+n-d) is equal to n, the index actually goes back to the starting index. I use mod to get the correct index where I want to assign the element when the index is larger than n. I'm not an english native speaker. Hope you will understand what I explain. :)
         */
        for (int i = 0; i < n; i++) {
            a[(i + n - d) % n] = Integer.parseInt(aItems[i]);
            System.out.printf("( %d + %d - %d ) mod %d = %d %n", i, n, d, n, (i + n - d) % n);
        }

        a = leftRotation(a, d);
        Arrays.stream(a).forEach(i -> System.out.print(i + " "));
        scanner.close();
    }

    public static int[] leftRotation(int[] a, int d) {
        int[] result = new int[a.length];
        for (int j = 0, x = d; j < result.length; j++, x++) {
            if (x == a.length) x = 0;
            if (j + 1 > a.length) break;
            else {
                result[j] = a[x];
            }
        }
        return result;
    }
}
