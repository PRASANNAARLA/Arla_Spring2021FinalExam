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
public class General extends Store {

    private double costPrice;
    private double sellingPrice;

    public General(double costPrice, double sellingPrice, int sellerId, String customerName, int noOfItems, double Cost) {
        super(sellerId, customerName, noOfItems, Cost);
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;

    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public double MoneyReceivedBySeller() {
        double profit = sellingPrice - costPrice;
        double totalReceived = super.getCost() + profit;
        return totalReceived;

    }

}
