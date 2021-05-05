/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Objects;

/**
 *
 * @author prasanna arla
 */
public class Geometry {

    private String shapeName;
    private double side1;
    private double side2;

    /**
     *
     * @param shapeName name of the shop is taken
     * @param side1 is taken
     * @param side2 is taken
     */
    public Geometry(String shapeName, double side1, double side2) {
        this.shapeName = shapeName;
        this.side1 = side1;
        this.side2 = side2;
    }

    /**
     *
     * @return gets the shapename
     */
    public String getShapeName() {
        return shapeName;
    }

    /**
     *
     * @param shapeName is set here
     */
    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    /**
     * getter method for side1
     *
     * @return will get side1
     */
    public double getSide1() {
        return side1;
    }

    /**
     * '
     * Setter method for side1
     *
     * @param side1 is set
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * getter method for side2
     *
     * @return will get side2
     */
    public double getSide2() {
        return side2;
    }

    /**
     * setter method for side2
     *
     * @param side2 is set
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     *
     * @return to check the hashcode is checked
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.shapeName);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.side1) ^ (Double.doubleToLongBits(this.side1) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.side2) ^ (Double.doubleToLongBits(this.side2) >>> 32));
        return hash;
    }

    /**
     * equals method
     *
     * @param obj
     * @return -returns boolean value
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Geometry other = (Geometry) obj;
        if (Double.doubleToLongBits(this.side1) != Double.doubleToLongBits(other.side1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.side2) != Double.doubleToLongBits(other.side2)) {
            return false;
        }
        if (!Objects.equals(this.shapeName, other.shapeName)) {
            return false;
        }
        return true;
    }

    /**
     * toString method
     *
     * @return -returns shapeName, side1, side2
     */
    @Override
    public String toString() {
        return "shapeName: " + shapeName + "\nside1: " + side1 + "\nside2: " + side2;
    }

}
