/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06uncheckedexception;

import java.util.Scanner;

/**
 *
 * @author prasanna arla
 */
public class FruitDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NullPointerException {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("prasanna arla");

        System.out.print("Enter the weight in lbs: ");
        long weight = scan.nextLong();
        System.out.print("Enter the cost in $: ");
        double cost = scan.nextDouble();

        String typeOfFruit = null;
        System.out.println("Enter the fruit name:");
        typeOfFruit = scan.next();

        Fruits fr = new Fruits(typeOfFruit, weight, cost);

        System.out.println(fr.toString());

        try {

            if (typeOfFruit.equals("mango")) {
                System.out.println("Fruit name is mango");
            }
        } catch (NullPointerException np) {
            System.out.println("Exception thrown");

        }
    }

}
