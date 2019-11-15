package arrays;

import org.junit.Assert;
import org.junit.Test;

import static arrays.Arrays_DS.reverseArray;
import static org.junit.Assert.*;

public class Arrays_DSTest {

    @Test
    public void reverseArrayTest() {
        int[] arr = {1, 4, 3, 2};
        int[] arr1 = {2, 3, 4, 1};
        int[] reverse = reverseArray(arr);
        Assert.assertArrayEquals(arr1, reverse);
    }
}