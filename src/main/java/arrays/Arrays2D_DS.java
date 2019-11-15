package arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arrays2D_DS {
    // Complete the hourglassSum function below.

    static int hourglassSum(int[][] arr) {
        int maxRow = 4;
        int maxColumn = 4;
        int max = -65; //because the constraint

        for (int row = 0; row < maxRow; row++) {
            for (int column = 0; column < maxColumn; column++) {
                int sum = arr[row][column] + arr[row][column + 1] + arr[row][column + 2];
                sum += arr[row + 1][column + 1];
                sum += arr[row + 2][column] + arr[row + 2][column + 1] + arr[row + 2][column + 2];
                if (max < sum){
                    max = sum;
                    System.out.println(max);
                }

            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
