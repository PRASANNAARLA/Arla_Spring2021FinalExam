/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author prasanna arla
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle circle) {
        return Double.compare(super.area(), circle.area());

    }

    @Override
    public String toString() {
        return "radius:- " + super.getRadius();
    }

}
