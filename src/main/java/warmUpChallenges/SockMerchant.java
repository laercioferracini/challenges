package warmUpChallenges;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SockMerchant {

    // Complete the sockMerchant function below.
    //10, 20, 20, 10, 10, 30, 50, 10, 20
    //1 1 3 1 2 1 3 3 3 3
    static int sockMerchant(int n, int[] ar) {
        int pares = 0;

        int[] check = new int[ar.length];
        for (int i = 0; i < check.length; i++) {
            check[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int x = i + 1; x < n; x++) {
                if (ar[i] == ar[x] && check[i] == 0 && check[x] == 0) {
                    pares++;
                    check[i] = 1;
                    check[x] = 1;
                }
            }
        }
        System.out.println(pares);
        return pares;

    }

    @Test
    public void teste1() {
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int result = sockMerchant(ar.length, ar);
        Assert.assertEquals(3, result);
    }

    @Test
    public void teste2() {
        int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int result = sockMerchant(ar.length, ar);
        Assert.assertEquals(4, result);
    }
}
