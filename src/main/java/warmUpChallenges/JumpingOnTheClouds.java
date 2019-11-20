package warmUpChallenges;

public class JumpingOnTheClouds {
    // Complete the jumpingOnClouds function below.
    public static int jumpingOnClouds(int[] c) {
        int jump = 0;
        for (int i = 0; i < c.length; ) {
            if (i + 1 >= c.length) break;
            if (i + 2 < c.length) {
                if (c[i + 2] == 0) {
                    ++jump;
                    i += 2;
                } else if (c[i + 1] == 0 && i + 1 < c.length) {
                    ++jump;
                    i += 1;
                }
            } else if (i + 1 <= c.length) {
                if (c[i + 1] == 0) {
                    ++jump;
                    i += 1;
                }
            }
        }
        return jump;
    }

    public static int jumpingOnClouds2(int[] c) {
        int n = c.length;
        int count = -1;
        for (int i = 0; i < n; i++, count++) {
            if (i < n - 2 && c[i + 2] == 0) i++;
        }
        System.out.println(count);
        return count;
    }
}
