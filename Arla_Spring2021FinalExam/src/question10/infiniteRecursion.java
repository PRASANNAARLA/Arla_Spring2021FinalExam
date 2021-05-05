/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author prasanna arla
 */
public class infiniteRecursion {

    private double value1;
    private double value2;

    public infiniteRecursion(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public double power(double x) {
        if (value1 == 0 || value2 == 0) {
            return 0.0;
        } else {

            return power(Math.pow(value1, value2));
        }

    }

    @Override
    public String toString() {
        return "number1: " + value1 + "\nnumber2: " + value2;
    }

}
