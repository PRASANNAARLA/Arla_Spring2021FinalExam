package question08;

import java.util.Scanner;

/**
 *
 * @author prasanna arla
 */
public class MultipleException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("prasanna arla");
            System.out.println("Enter a value");
            int a = sc.nextInt();
            System.out.println("Enter b value");
            int b = sc.nextInt();
            method(a, b);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    private static void method(int integerA, int integerB) throws ArithmeticException, NumberFormatException {
        if (integerB == 0) {
            throw new ArithmeticException("Arithmetic Exception");
        }
        integerA = Integer.parseInt(null);
        throw new NumberFormatException("NumberFormat Exception");
    }
}
