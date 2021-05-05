/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09example01;

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

        System.out.print("Enter value1: ");
        int value1 = scan.nextInt();
        System.out.println("Enter value2: ");
        int value2 = scan.nextInt();

        try {
            Class c = new Class(value1, value2);
            System.out.println(c.toString());
            System.out.println(c.Exception());
        } catch (Exception e) {
            System.out.println("throws exception");
        }
    }
}
