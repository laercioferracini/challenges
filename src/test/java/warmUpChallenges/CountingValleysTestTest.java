package warmUpChallenges;

import org.junit.Test;

import static org.junit.Assert.*;
import static warmUpChallenges.CountingValleys.countingValleys;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>20/11/2019</pre>
 */
public class CountingValleysTestTest {

    @Test
    public void teste1() {
        String s = "UDDDUDUU";
        int result = countingValleys(s.length(), s);
        assertEquals(1, result);
    }
}