/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

/**
 *
 * @author prasanna arla
 */
public class Square extends GeometricObject implements Colorable {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     *
     */
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public double area() {
        return length * length;
    }

}
