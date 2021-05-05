/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09examples02;

import java.util.Scanner;

/**
 *
 * @author prasanna arla
 */
public class ThrowsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IndexOutOfBoundsException {

        Scanner scan = new Scanner(System.in);
        System.out.println("prasanna arla");

        System.out.print("Enter the string: ");

        try {

            String str = scan.next();

            System.out.println(str.substring(0, 12));

        } catch (Exception e) {
            System.out.println("Exception is thrown");
        }

    }

}
