import java.util.Scanner;

public class JavaStaticInitializerBlock {

    private static boolean flag = initializeClassVariable();
    private static int B;
    private static int H;

    private static boolean initializeClassVariable() {
        boolean resultado = false;
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        try {
            if (B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
            } else {
                resultado = true;
            }
        } catch (Exception e) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        return resultado;
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class
