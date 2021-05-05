/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03NarrowingCasting;

/**
 *
 * @author prasanna arla
 */
public class ShapesClass {

    private int numberOfSides;
    private long length;

    public ShapesClass(int numberOfSides, long length) {
        this.numberOfSides = numberOfSides;
        this.length = length;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "numberOfSides: " + numberOfSides + "\nlength: " + length;
    }

}
