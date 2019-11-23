package strings;

import org.junit.Test;

import static org.junit.Assert.*;
import static strings.DuplicateWords.removeDuplicateWords;
/**
 * @author lferracini
 * @project = challenges
 * @since <pre>20/11/2019</pre>
 */
public class DuplicateWordsTestTest {

    @Test
    public void removeDuplicateWordsTest() {
        assertEquals("Goodbye bye world", removeDuplicateWords("Goodbye bye bye world world world"));
    }
}