package arrays;

import org.junit.Assert;
import org.junit.Test;

import static arrays.Arrays_DS_ReverseArray.reverseArray;

public class Arrays_DSReverseArrayTest {

    @Test
    public void reverseArrayTest() {
        int[] arr = {1, 4, 3, 2};
        int[] arr1 = {2, 3, 4, 1};
        int[] reverse = reverseArray(arr);
        Assert.assertArrayEquals(arr1, reverse);
    }
}