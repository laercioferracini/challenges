package arrays;

public class Array2D {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };

        for (int r = 0; r < 7; r++)
            for (int c = 0; c < 2; c++)
                System.out.println("arr[" + r + "][" + c + "] = " + arr[r][c]);
    }
}
