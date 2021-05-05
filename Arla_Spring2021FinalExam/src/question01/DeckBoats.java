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
public class DeckBoats extends Boats {

    private double speed;
    private String type;

    public DeckBoats(double speed, String type, int boatCapacity, double boatCost) {
        super(boatCapacity, boatCost);
        this.speed = speed;
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int boatlife() {
        int year = 0;
        if (type.equalsIgnoreCase("travel")) {
            year = 20;
        } else if (type.equalsIgnoreCase("delivery")) {
            year = 10;
        }
        return year;

    }

    @Override
    public String toString() {
        return super.toString() + "\nDeckBoats{" + "speed=" + speed + ", type=" + type + ", boatlifetime=" + boatlife() + '}';
    }

}
