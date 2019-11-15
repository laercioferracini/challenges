package warmUpChallenges;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {
    private static final int seaLevel = 0;

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int currentLevel = 0;
        int valleys = 0;
        s = s.toUpperCase();
        char[] step = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (step[i] == 'U') ++currentLevel;
            if (step[i] == 'D') --currentLevel;
            //check if the hiker climbs up to the surface
            if (currentLevel == 0 && step[i] == 'U') ++valleys;
        }
        return valleys;
    }

    @Test
    public void teste1() {
        String s = "UDDDUDUU";
        int result = countingValleys(s.length(), s);
        Assert.assertEquals(1, result);
    }
}
