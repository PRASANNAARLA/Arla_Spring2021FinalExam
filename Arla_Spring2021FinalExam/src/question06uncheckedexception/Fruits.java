/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06uncheckedexception;

/**
 *
 * @author prasanna arla
 */
public class Fruits {

    private String typeOfFruit;

    private long weight;

    private double cost;

    public Fruits(String typeOfFruit, long weight, double cost) {
        this.typeOfFruit = typeOfFruit;
        this.weight = weight;
        this.cost = cost;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public void setTypeOfFruit(String typeOfFruit) {
        this.typeOfFruit = typeOfFruit;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "typeOfFruit: " + typeOfFruit + "\nweight: " + weight + "\ncost: " + cost;
    }

}
