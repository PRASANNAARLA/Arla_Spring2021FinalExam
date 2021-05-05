/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09example01;

/**
 *
 * @author prasanna arla
 */
public class Class {

    private int value1;

    private int value2;

    public Class(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int sum() {
        return value1 + value2;
    }

    public String Exception() {
        String st = " ";
        if ((value1 + value2) < 0) {
            throw new ArithmeticException("Throws exception");
        } else {
            st = ("The sum is: " + sum());
        }
        return st;
    }

    @Override
    public String toString() {
        return "value1 : " + value1 + "\nvalue2: " + value2;
    }

}
