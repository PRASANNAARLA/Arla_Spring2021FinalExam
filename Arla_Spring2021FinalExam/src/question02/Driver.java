/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prasanna arla
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObject[] geo = new Square[5];
        GeometricObject geo1 = new Square(2);
        GeometricObject geo2 = new Square(6);
        GeometricObject geo3 = new Square(8);
        GeometricObject geo4 = new Square(11);
        GeometricObject geo5 = new Square(7);
        geo[0] = geo1;
        geo[1] = geo2;
        geo[2] = geo3;
        geo[3] = geo4;
        geo[4] = geo5;
        System.out.println("prasanna arla");
        for (GeometricObject g : geo) {

            System.out.println("Area of the object is: " + g.area());
            if (g instanceof Colorable) {
                Colorable co = (Colorable) g;
                co.howToColor();
            }

        }
    }
}
