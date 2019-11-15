package arrays;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static arrays.LeftRotation.leftRotation;

/**
 * LeftRotation Tester.
 *
 * @author Laercio Ferracini
 * @version 1.0
 * @since <pre>nov 15, 2019</pre>
 */
public class LeftRotationTest {

    /**
     * Method: leftRotation(int[] a, int d)
     */
    @Test
    public void testLeftRotation() throws Exception {

        int n = 5;

        int d = 4;

        int[] a = {1, 2, 3, 4, 5};
        int[] saida = {5, 1, 2, 3, 4};
        int[] result = leftRotation(a, d);
        Assert.assertArrayEquals(saida, result);
/* 
try { 
   Method method = LeftRotation.getClass().getMethod("leftRotation", int[].class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

} 
