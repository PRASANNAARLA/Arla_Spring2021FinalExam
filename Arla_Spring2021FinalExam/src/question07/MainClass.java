/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

import java.util.*;

/**
 *
 * @author prasanna arla
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
        }
        Scanner scanA = new Scanner(System.in);
        System.out.println("prasanna arla");
        System.out.println("Enter the index of the array ");
        int input = scanA.nextInt();
        if (input >= 0 && input < 100) {
            System.out.println("Value at Corresponding Index " + input + " is: " + arr[input]);
        } else {
            System.out.println(" Out of Bounds.");
        }
        scanA.close();
    }

}
