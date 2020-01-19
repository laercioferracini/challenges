package exception_handling;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>18/01/2020</pre>
 */
public class MyCalculatorTestTest {

    @Test
    @DisplayName("Testing power of 3 ")
    public void powerTest1() throws Exception {
        assertThat(ExceptionHandling.my_calculator.power(3, 5), equalTo(243L));
    }

    @Test
    public void powerTest2() throws Exception {
        assertThat(ExceptionHandling.my_calculator.power(2, 4), equalTo(16L));
    }

    @Test
    public void powerTest3() {
        Exception exception = assertThrows(Exception.class, () -> ExceptionHandling.my_calculator.power(0, 0));
        assertEquals("n and p should not be zero.", exception.getMessage());
    }

    @Test
    public void powerTest4() {
        Exception exception = assertThrows(Exception.class, () -> ExceptionHandling.my_calculator.power(-1, -4));
        assertEquals("n or p should not be negative.", exception.getMessage());
    }

    @Test
    public void powerTest5() {
        Exception exception = assertThrows(Exception.class, () -> ExceptionHandling.my_calculator.power(-1, 3));
        assertEquals("n or p should not be negative.", exception.getMessage());
    }

    @Test
    public void powerTest6() throws Exception {
        assertThat(ExceptionHandling.my_calculator.power(10, 0), equalTo(1L));
    }

    @Test
    public void powerTest7() throws Exception {
        assertThat(ExceptionHandling.my_calculator.power(10, 0), equalTo(1L));
    }

    @Test
    public void powerTest8() {
        Exception exception = assertThrows(Exception.class, () -> ExceptionHandling.my_calculator.power(-1, 4));
        assertEquals("n or p should not be negative.", exception.getMessage());
    }

    @Test
    public void powerTest9() {
        Exception exception = assertThrows(Exception.class, () -> ExceptionHandling.my_calculator.power(2, -3));
        assertEquals("n or p should not be negative.", exception.getMessage());
    }

    @Test
    public void powerTest10() {
        Exception exception = assertThrows(Exception.class, () -> ExceptionHandling.my_calculator.power(-2, -2));
        assertEquals("n or p should not be negative.", exception.getMessage());
    }

    @Test
    public void powerTest11() throws Exception {
        assertThat(ExceptionHandling.my_calculator.power(5, 6), equalTo(15625L));
    }

    @Test
    public void powerTest12() throws Exception {
        assertThat(ExceptionHandling.my_calculator.power(3, 3), equalTo(27L));
    }

    @Test
    public void powerTest13() throws Exception {
        assertThat(ExceptionHandling.my_calculator.power(8, 0), equalTo(1L));
    }

    @Test
    public void powerTest14() throws Exception {
        assertThat(ExceptionHandling.my_calculator.power(2, 3), equalTo(8L));
    }

    @Test
    public void powerTest15() {
        Exception exception = assertThrows(Exception.class, () -> ExceptionHandling.my_calculator.power(3, -3));
        assertEquals("n or p should not be negative.", exception.getMessage());
    }

}