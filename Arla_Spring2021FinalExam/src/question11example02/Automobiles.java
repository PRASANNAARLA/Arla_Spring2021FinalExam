/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11example02;

/**
 *
 * @author prasanna arla
 */
public class Automobiles {

    private final double miles;
    private final int timeTakenToTravel;

    /**
     * two argument constructor
     *
     * @param miles- datatype of double
     * @param timeTakenToTravel -datatype of int
     */
    public Automobiles(double miles, int timeTakenToTravel) {
        this.miles = miles;
        this.timeTakenToTravel = timeTakenToTravel;
    }

    /**
     * getter method for miles
     *
     * @return -miles
     */
    public double getMiles() {
        return miles;
    }

    /**
     * getter method for timeTakenToTravel
     *
     * @return -timeTakenToTravel
     */
    public int getTimeTakenToTravel() {
        return timeTakenToTravel;
    }

    /**
     * getter method for speed
     *
     * @return -speed
     */
    public double getSpeed() {
        double speed = 0.0;
        speed = miles / timeTakenToTravel;
        return speed;
    }

    /**
     * hashcode
     *
     * @return -hash of datatype int
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.miles) ^ (Double.doubleToLongBits(this.miles) >>> 32));
        hash = 71 * hash + this.timeTakenToTravel;
        return hash;
    }

    /**
     * equals() methods it compare equality of two Objects
     *
     * @param obj
     * @return-booelan
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
        final Automobiles other = (Automobiles) obj;
        if (Double.doubleToLongBits(this.miles) != Double.doubleToLongBits(other.miles)) {
            return false;
        }
        if (this.timeTakenToTravel != other.timeTakenToTravel) {
            return false;
        }
        return true;
    }

    /**
     * toString method
     *
     * @return -miles, timeTakenToTravel
     */
    @Override
    public String toString() {
        return "miles: " + miles + "\ntimeTakenToTravel: " + timeTakenToTravel;
    }

}
