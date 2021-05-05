/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06checkedexception;

/**
 *
 * @author prasanna arla
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StoreDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("prasanna arla");
        try {
            Scanner scan = new Scanner(new File("fileinpu.txt"));

            while (scan.hasNext()) {
                int sellerId = scan.nextInt();
                String customerName = scan.next();
                int noOfItems = scan.nextInt();
                double Cost = scan.nextDouble();
                double costPrice = scan.nextDouble();
                double sellingPrice = scan.nextDouble();
                Store store = new Store(sellerId, customerName, noOfItems, Cost);

                General gen = new General(costPrice, sellingPrice, sellerId, customerName, noOfItems, Cost);
                System.out.println(store.toString());
                System.out.println(gen.getCostPrice());
                System.out.println(gen.getSellingPrice());
                System.out.print("Money received by seller is: ");
                System.out.println(gen.MoneyReceivedBySeller());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");

        }
    }

}
