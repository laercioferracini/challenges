package arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Arrays2D_DSTest {
    private static int sumRow(int rowIndex, int startColIndex, int endcolIndex, int[][] array) {

        int sum = 0;
        for (int col = startColIndex; col <= endcolIndex; col++) {
            sum = sum + array[rowIndex][col];
        }
        return sum;
    }

    private static int hourglassSum(int[][] arr) {
        int maxRow = 6, maxCol = 6, rowIndex = 0, columnIndex = 0, maxValue = 0;
        while (true) {
            //Hour Glass Sum
            int rowOne = sumRow(rowIndex, columnIndex, columnIndex + 2, arr);
            int rowTwo = arr[rowIndex + 1][columnIndex + 1];
            int rowThree = sumRow(rowIndex + 2, columnIndex, columnIndex + 2, arr);

            int total = rowOne + rowTwo + rowThree;

            if ((rowIndex == 0 && columnIndex == 0) || maxValue < total) {
                maxValue = total;
            }

            columnIndex++;
            if (columnIndex >= maxCol - 2) {
                rowIndex++;
                columnIndex = 0;
            }
            if (rowIndex >= maxRow - 2)
                break;
        }
        return maxValue;
    }

    @Test
    public void hourglassSumTest() {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int result = Arrays2D_DS.hourglassSum(arr);
        Assert.assertEquals(7, result);
    }

    @Test
    public void hourglassSumTest2() {
        int[][] arr = {
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        int result = Arrays2D_DS.hourglassSum(arr);
        Assert.assertEquals(28, result);
    }

    @Test
    public void hourglassSumTest3() {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        int result = Arrays2D_DS.hourglassSum(arr);
        Assert.assertEquals(19, result);
    }
}