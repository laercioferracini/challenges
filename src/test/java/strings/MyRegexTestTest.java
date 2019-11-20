package strings;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>20/11/2019</pre>
 */
public class MyRegexTestTest {

    @Test
    public void test1() {
        String IP = "12.12.12.12";
        Assert.assertTrue(IP.matches(new MyRegex().pattern));
    }

    @Test
    public void test2() {
        String IP = "13.13.13.112";
        Assert.assertTrue(IP.matches(new MyRegex().pattern));
    }

    @Test
    public void test3() {
        String IP = "VUUT.12.12";
        Assert.assertFalse(IP.matches(new MyRegex().pattern));

    }

    @Test
    public void test4() {
        String IP = "111.111.11.111";
        Assert.assertTrue(IP.matches(new MyRegex().pattern));

    }

    @Test
    public void test5() {
        String IP = "1.1.1.1.1.1.1";
        Assert.assertFalse(IP.matches(new MyRegex().pattern));
    }

    @Test
    public void test6() {
        String IP = ".....";
        Assert.assertFalse(IP.matches(new MyRegex().pattern));
    }

    @Test
    public void test7() {
        String IP = "1...1..1..1";
        Assert.assertFalse(IP.matches(new MyRegex().pattern));
    }

    @Test
    public void test8() {
        String IP = "0.0.0.0";
        Assert.assertTrue(IP.matches(new MyRegex().pattern));
    }

    @Test
    public void test9() {
        String IP = "255.0.255.0";
        Assert.assertTrue(IP.matches(new MyRegex().pattern));
    }

    @Test
    public void test10() {
        String IP = "266.266.266.266";
        Assert.assertFalse(IP.matches(new MyRegex().pattern));
    }

    @Test
    public void test11() {
        String IP = "00000.000000.0000000.00001";
        Assert.assertFalse(IP.matches(new MyRegex().pattern));
    }

    @Test
    public void test12() {
        String IP = "0023.0012.0012.0034";
        Assert.assertFalse(IP.matches(new MyRegex().pattern));
    }

    @Test
    public void test13() {
        String IP = "000.12.12.034";
        Assert.assertTrue(IP.matches(new MyRegex().pattern));
    }

    @Test
    public void test14() {
        String IP = "121.234.12.12";
        Assert.assertTrue(IP.matches(new MyRegex().pattern));
    }

    @Test
    public void test15() {
        String IP = "93.45.12.56";
        Assert.assertTrue(IP.matches(new MyRegex().pattern));
    }

    @Test
    public void test16() {
        String IP = "00.12.123.123123.123";
        Assert.assertFalse(IP.matches(new MyRegex().pattern));
    }

    @Test
    public void test17() {
        String IP = "122.23";
        Assert.assertFalse(IP.matches(new MyRegex().pattern));
    }

    @Test
    public void test18() {
        String IP = "Hello.IP";
        Assert.assertFalse(IP.matches(new MyRegex().pattern));
    }
    @Test
    public void test19() {
        String IP = "255.255.255.255";
        Assert.assertTrue(IP.matches(new MyRegex().pattern));
    }
    @Test
    public void test20() {
        String IP = "249.249.249.249";
        Assert.assertTrue(IP.matches(new MyRegex().pattern));
    }
}