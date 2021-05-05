/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

import java.util.Scanner;

/**
 *
 * @author prasanna arla
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ComparableCircle circle1 = new ComparableCircle(15.8);

        ComparableCircle circle2 = new ComparableCircle(16.4);
        System.out.println("prasanna arla");

        System.out.println("Larger instance: " + findLargest(circle1, circle2));
    }

    private static String findLargest(ComparableCircle c1, ComparableCircle c2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String p = " ";
        if (c1.compareTo(c2) > 0) {
            p = "The first circle area is large.";
        } else if (c1.compareTo(c2) < 0) {
            p = "The second circle area is large.";
        } else {
            p = "Both the areas are equal";
        }

        return p;
    }

}
