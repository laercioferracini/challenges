package string;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static strings.Anagrams.isAnagram;

/**
 * Anagrams Tester.
 *
 * @author lferracini
 * @version 1.0
 * @since <pre>nov 16, 2019</pre>
 */
public class AnagramsTest {

    /**
     * Method: isAnagram(String a, String b)
     */
    @Test
    public void testIsAnagram1() {
        String a = "anagram";
        String b = "margana";
        boolean ret = isAnagram(a, b);
        Assert.assertTrue(ret);
    }
    /**
     * Method: isAnagram(String a, String b)
     */
    @Test
    public void testIsAnagram2() {
        String a = "Hello";
        String b = "hello";
        boolean ret = isAnagram(a, b);
        Assert.assertTrue(ret);
    }

} 
