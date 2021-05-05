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
public class HomeBoats extends Boats {

    private double velocity;
    private double distanceTraveled;

    public HomeBoats(double velocity, double distanceTraveled, int boatCapacity, double boatCost) {
        super(boatCapacity, boatCost);
        this.velocity = velocity;
        this.distanceTraveled = distanceTraveled;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int boatlife() {
        int year = 0;
        if (distanceTraveled >= 100) {
            year = 10;

        } else if (distanceTraveled < 100) {
            year = 20;
        }
        return year;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHomeBoats{" + "velocity=" + velocity + ", distanceTraveled=" + distanceTraveled + ", boatlifetime=" + boatlife() + '}';
    }

}
