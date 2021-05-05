/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

import java.util.Scanner;

/**
 *
 * @author prasanna arla
 */
public class BoatsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("prasanna arla");
        System.out.println("Enter boat capacity :");
        int capacity = scan.nextInt();
        System.out.print("enter boat cost :$ ");
        double cost = scan.nextDouble();
        System.out.print("Enter boat speed: m/s ");
        double speed = scan.nextDouble();
        System.out.print("Enter boat type: ");
        String type = scan.next();
        System.out.print("Enter boat velocity: m/s ");
        double velocity = scan.nextDouble();
        System.out.print("enter boat distance travelled: miles ");
        double distance = scan.nextDouble();
        DeckBoats boat1 = new DeckBoats(speed, type, capacity, cost);
        HomeBoats boat2 = new HomeBoats(velocity, distance, capacity, cost);
        System.out.println(boat1.toString());
        System.out.println(boat2.toString());

    }

}
