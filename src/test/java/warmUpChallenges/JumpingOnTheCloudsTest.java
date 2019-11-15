package warmUpChallenges;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static warmUpChallenges.JumpingOnTheClouds.jumpingOnClouds;
import static warmUpChallenges.JumpingOnTheClouds.jumpingOnClouds2;

/**
 * JumpingOnTheClouds Tester.
 *
 * @author Laercio Ferracini
 * @version 1.0
 * @since <pre>nov 12, 2019</pre>
 */
public class JumpingOnTheCloudsTest {

    /**
     * Method: jumpingOnClouds(int[] c)
     */
    @Test
    public void testJumpingOnCloudsForm() {
        int[] jumps = {0, 0, 0, 0, 1, 0};
        int result = jumpingOnClouds(jumps);
        Assert.assertEquals(3, result);
    }

    /**
     * Method: jumpingOnClouds2(int[] c)
     */
    @Test
    public void testJumpingOnCloudsForm1() {
        int[] jumps = {0, 0, 0, 1, 0, 0};
        int result = jumpingOnClouds(jumps);
        Assert.assertEquals(3, result);
    }

    /**
     * Method: jumpingOnClouds(int[] c)
     */
    @Test
    public void testJumpingOnCloudsForm2() {
        int[] jumps = {0, 0, 0, 0, 1, 0};
        int result = jumpingOnClouds2(jumps);
        Assert.assertEquals(3, result);
    }

    /**
     * Method: jumpingOnClouds2(int[] c)
     */
    @Test
    public void testJumpingOnCloudsForm22() {
        int[] jumps = {0, 0, 0, 1, 0, 0};
        int result = jumpingOnClouds2(jumps);
        Assert.assertEquals(3, result);
    }
} 
