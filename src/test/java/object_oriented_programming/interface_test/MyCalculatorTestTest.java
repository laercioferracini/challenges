package object_oriented_programming.interface_test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>09/12/2019</pre>
 */
public class MyCalculatorTestTest {

    @Test
    public void divisor_sumTest() {
        MyCalculator c = new MyCalculator();
        int result = c.divisor_sum(6);
        assertThat(" 6 ", result, equalTo(12));
    }
    @Test
    public void divisor_sumTest1() {
        MyCalculator c = new MyCalculator();
        int result = c.divisor_sum(1);
        assertThat(" 1 ", result, equalTo(1));
    }
    @Test
    public void divisor_sumTest2() {
        MyCalculator c = new MyCalculator();
        int result = c.divisor_sum(20);
        assertThat(" 42 ", result, equalTo(42));
    }
    @Test
    public void divisor_sumTest42() {
        MyCalculator c = new MyCalculator();
        int result = c.divisor_sum(42);
        assertThat(" 96 ", result, equalTo(96));
    }

    @Test
    public void divisor_sumTestNotEquals() {
        MyCalculator c = new MyCalculator();
        int result = c.divisor_sum(42);
        assertThat(" Not equals to 96 ", result, not(equalTo(97)));
    }
}