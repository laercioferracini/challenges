package strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>24/11/2019</pre>
 */
public class ValidUsernameRegularExpressionTest {

    @Test
    public void test1() {
        String username = "Julia";
        assertFalse(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }

    @Test
    public void test2() {
        String username = "Samantha";
        assertTrue(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }

    @Test
    public void test3() {
        String username = "Samantha_21";
        assertTrue(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }

    @Test
    public void test4() {
        String username = "1Samantha";
        assertFalse(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }

    @Test
    public void test5() {
        String username = "Samantha?10_2A";
        assertFalse(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }

    @Test
    public void test6() {
        String username = "JuliaZ007";
        assertTrue(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }

    @Test
    public void test7() {
        String username = "Julia@007";
        assertFalse(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }

    @Test
    public void test8() {
        String username = "_Julia007";
        assertFalse(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }
    @Test
    public void test9() {
        String username = "asdasdasdasdasdasdasdasdasdasdd";
        assertFalse(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }
    @Test
    public void test10() {
        String username = "asdasdasdasdasdasdasdasdasdasd";
        assertTrue(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }
}