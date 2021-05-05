/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03WideningCasting;

/**
 *
 * @author prasanna arla
 */
public class Shapes {

    private int numberOfSides;
    private double length;

    public Shapes(int numberOfSides, double length) {
        this.numberOfSides = numberOfSides;
        this.length = length;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "numberOfSides: " + numberOfSides + "\nlength: " + length;
    }

}
