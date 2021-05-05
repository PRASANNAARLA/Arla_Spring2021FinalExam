/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.Scanner;

/**
 *
 * @author prasanna arla
 */
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("prasanna arla");
        System.out.print("Enter the first value: ");
        double value1 = scan.nextDouble();
        System.out.print("Enter the second value: ");
        double value2 = scan.nextDouble();

        try {
            infiniteRecursion in = new infiniteRecursion(value1, value2);

            System.out.println(in.toString());
            System.out.println(in.power(12.5));
        } catch (StackOverflowError o) {
            System.out.println("infinite recursion occured");
        }

    }
}
