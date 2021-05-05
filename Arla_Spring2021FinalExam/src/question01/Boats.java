/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

/**
 *
 * @author prasanna arla
 */
public abstract class Boats {

    private int boatCapacity;
    private double boatCost;

    public Boats(int boatCapacity, double boatCost) {
        this.boatCapacity = boatCapacity;
        this.boatCost = boatCost;
    }

    public int getBoatCapacity() {
        return boatCapacity;
    }

    public void setBoatCapacity(int boatCapacity) {
        this.boatCapacity = boatCapacity;
    }

    public double getBoatCost() {
        return boatCost;
    }

    public void setBoatCost(double boatCost) {
        this.boatCost = boatCost;
    }

    public abstract int boatlife();

    @Override
    public String toString() {
        return "boatCapacity=" + boatCapacity + ", boatCost=" + boatCost;
    }

}
