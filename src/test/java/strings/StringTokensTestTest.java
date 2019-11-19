package strings;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static strings.StringTokens.dividirFrase;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>16/11/2019</pre>
 */
public class StringTokensTestTest {

    @Test
    public void dividirFraseTest() {
        String frase = "He is a very very good boy, isn't he?";
        String result = dividirFrase(frase);
        Assert.assertEquals("10\n" +
                "He\n" +
                "is\n" +
                "a\n" +
                "very\n" +
                "very\n" +
                "good\n" +
                "boy\n" +
                "isn\n" +
                "t\n" +
                "he", result);
    }@Test
    public void dividirFraseTest2   () {
        String frase = "               YES      leading spaces        are valid,    problemsetters are         evillllll";
        String result = dividirFrase(frase);
        Assert.assertEquals("8\n" +
                "YES\n" +
                "leading\n" +
                "spaces\n" +
                "are\n" +
                "valid\n" +
                "problemsetters\n" +
                "are\n" +
                "evillllll", result);
    }
}