/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03WideningCasting;

/**
 *
 * @author prasanna arla
 */
public class ShapesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numberOfSides = 17;
        float height = numberOfSides;
        long width = numberOfSides;
        double length = width;

        Shapes cub = new Cuboid(width, height, numberOfSides, length);
        System.out.println("prasanna arla");
        System.out.println(cub.toString());

    }

}
