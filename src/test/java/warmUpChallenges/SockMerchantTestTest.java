package warmUpChallenges;

import org.junit.Test;

import static org.junit.Assert.*;
import static warmUpChallenges.SockMerchant.sockMerchant;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>20/11/2019</pre>
 */
public class SockMerchantTestTest {

    @Test
    public void teste1() {
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int result = sockMerchant(ar.length, ar);
        assertEquals(3, result);
    }

    @Test
    public void teste2() {
        int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int result = sockMerchant(ar.length, ar);
        assertEquals(4, result);
    }
}