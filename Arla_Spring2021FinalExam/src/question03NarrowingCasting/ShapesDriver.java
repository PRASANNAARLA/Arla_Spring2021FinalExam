/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03NarrowingCasting;

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

        double edge = 12.7;
        long length = (long) edge;
        int numberOfSides = (int) length;

        Polyhedron cub = new Polyhedron(edge, "Octahedron", numberOfSides, length);
        System.out.println("prasanna arla");
        System.out.println(cub.toString());

    }

}
