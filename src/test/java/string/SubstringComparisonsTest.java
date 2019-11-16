package string;

import org.junit.Assert;
import org.junit.Test;

import static strings.SubstringComparisons.getSmallestAndLargest;

/**
 * JavaSubstringComparisons Tester.
 *
 * @author Laercio Ferracini
 * @version 1.0
 * @since <pre>nov 15, 2019</pre>
 */
public class SubstringComparisonsTest {

    /**
     * Method: getSmallestAndLargest(String s, int k)
     */
    @Test
    public void testGetSmallestAndLargest() throws Exception {
        String input = "welcometojava";
        String result = getSmallestAndLargest(input, 3);
        Assert.assertEquals("ava\nwel", result);
    }
    @Test
    public void testGetSmallestAndLargest1() throws Exception {
        String input = "welcomeToJava";
        String result = getSmallestAndLargest(input, 3);
        Assert.assertEquals("Jav\nwel", result);
    }
}
