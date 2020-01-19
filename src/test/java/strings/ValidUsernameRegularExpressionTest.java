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
        System.out.println(username);
        assertFalse(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }

    @Test
    public void test2() {
        String username = "Samantha";
        System.out.println(username);
        assertTrue(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }

    @Test
    public void test3() {
        String username = "Samantha_21";
        System.out.println(username);
        assertTrue(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }

    @Test
    public void test4() {
        String username = "1Samantha";
        System.out.println(username);
        assertFalse(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }

    @Test
    public void test5() {
        String username = "Samantha?10_2A";
        System.out.println(username);
        assertFalse(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }

    @Test
    public void test6() {
        String username = "JuliaZ007";
        System.out.println(username);
        assertTrue(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }

    @Test
    public void test7() {
        String username = "Julia@007";
        System.out.println(username);
        assertFalse(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }

    @Test
    public void test8() {
        String username = "_Julia007";
        System.out.println(username);
        assertFalse(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }
    @Test
    public void test9() {
        String username = "asdasdasdasdasdasdasdasdasdasdd";
        System.out.println(username);
        assertFalse(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }
    @Test
    public void test10() {
        String username = "asdasdasdasdasdasdasdasdasdasd";
        System.out.println(username);
        assertTrue(username.matches(ValidUsernameRegularExpression.UsernameValidator.regularExpression));
    }
}