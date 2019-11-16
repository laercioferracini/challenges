package string;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static strings.StringReverse.isPalindrome;

/**
 * StringReverse Tester.
 *
 * @author lferracini
 * @version 1.0
 * @since <pre>nov 16, 2019</pre>
 */
public class StringReverseTest {

    /**
     * Method: isPalindrome(String s)
     */
    @Test
    public void testIsPalindrome() {
        String input = "madam";
        String result = isPalindrome(input);
        assertEquals("Yes", result);
    }


    /**
     * Method: isPalindrome(String s)
     */
    @Test
    public void testIsNotPalindrome() {
        String input = "birobiro";
        String result = isPalindrome(input);
        assertEquals("No", result);
    }

    /**
     * Method: isPalindrome(String s)
     */
    @Test
    public void testIsPalindrome2() {
        String input = "madam";
        String result = isPalindrome(input);
        assertNotEquals("No", result);
    }
    /**
     * Method: reverseStringArray(char[] s)
     */
    @Test
    public void testReverseStringArray() throws Exception {
        //TODO: Test goes here...
    }

} 
