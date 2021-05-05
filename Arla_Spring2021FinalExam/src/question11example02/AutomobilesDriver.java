/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11example02;

/**
 *
 * @author prasanna arla
 */
public class AutomobilesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * three objects a1,a2,a3 are created and values are given for them
         */
        Automobiles a1 = new Automobiles(12.3, 15);
        Automobiles a2 = new Automobiles(8.7, 19);
        Automobiles a3 = new Automobiles(6.8, 21);
        System.out.println("prasanna arla");
        /**
         * prints the toString for the object a1
         */
        System.out.println(a1.toString());
        /**
         * prints the toString for the object a2
         */
        System.out.println(a2.toString());
        System.out.println("----------------------------------------");
        System.out.println(" ");
        /**
         * prints the value after comparision of a1 and a2
         */
        System.out.println(a1.equals(a2));
        /**
         * prints the value after comparision of a2 and a3
         */
        System.out.println(a2.equals(a3));
        /**
         * prints the value after comparision of a3 and a1
         */
        System.out.println(a3.equals(a1));

        System.out.println("-----------------------------------");
        System.out.println(a1 == a2);
        System.out.println(a2 == a3);
        System.out.println(a3 == a1);

        System.out.println("-----------------------------------");
        /**
         * prints the booelan value which is true or false
         */
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());

    }
}
