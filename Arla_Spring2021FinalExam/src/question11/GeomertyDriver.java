/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author prasanna arla
 */
public class GeomertyDriver {

    /**
     * @param args the main driver class
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * two objects are created geo1 and geo2
         */
        Geometry geo1 = new Geometry("rectangle", 21, 12);
        Geometry geo2 = new Geometry("pentagon", 15, 16);
        System.out.println("prasanna arla");
        /**
         * if else if statement is given to check by hashcode() are equal or no
         */
        if (geo1.hashCode() == geo2.hashCode()) {
            if (geo1.equals(geo2)) {
                System.out.println("Both are equal");
            } else {
                System.out.println("Not equal");
            }
        } else {
            System.out.println("Both are not equal");
        }

    }

}
