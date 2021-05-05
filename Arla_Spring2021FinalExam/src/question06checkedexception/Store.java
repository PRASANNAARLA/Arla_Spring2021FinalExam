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
public class Store {

    private int sellerId;
    private String customerName;
    private int noOfItems;
    private double Cost;

    public Store(int sellerId, String customerName, int noOfItems, double Cost) {
        this.sellerId = sellerId;
        this.customerName = customerName;
        this.noOfItems = noOfItems;
        this.Cost = Cost;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }

    public double MoneyReceivedBySeller() {
        double moneyReceived = noOfItems * Cost;
        return moneyReceived;

    }

    @Override
    public String toString() {
        return "sellerId: " + sellerId + "\ncustomerName: " + customerName + "\nnoOfItems: " + noOfItems + "\nCost: " + Cost;
    }

}
