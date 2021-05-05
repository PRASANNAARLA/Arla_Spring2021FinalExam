/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01example02;

import java.util.Scanner;

/**
 *
 * @author prasanna arla
 */
public class TablesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("prasanna arla");
        System.out.println("Enter the wood type :");
        String type = scan.next();
        System.out.println("Enter the number of seats");
        int seat = scan.nextInt();
        Tables table = new Tables(type, seat);
        System.out.println(table.toString());

    }

}
