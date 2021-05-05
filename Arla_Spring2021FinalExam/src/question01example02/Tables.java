/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01example02;

/**
 *
 * @author prasanna arla
 */
public class Tables implements DinnigTable, CoffeeTable {

    public String woodType;
    public int numberOfSeats;

    public Tables(String woodType, int numberOfSeats) {
        this.woodType = woodType;
        this.numberOfSeats = numberOfSeats;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String CoffeeLenght() {
        String len = "the area of coffee table is 5sq.ft";
        return len;
    }

    public String DinnigLenght() {
        String len = "the area of dinning table is 15sq.ft";
        return len;
    }

    @Override
    public String toString() {
        return "Tables{" + "woodType=" + woodType + ", numberOfSeats=" + numberOfSeats + ", Area dinning table=" + DinnigLenght() + ", Area coffe table=" + CoffeeLenght() + '}';
    }

}
