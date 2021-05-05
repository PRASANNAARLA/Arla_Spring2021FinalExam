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
public class Polyhedron extends ShapesClass {

    private double edge;

    private String typeOfPolyhedron;

    public Polyhedron(double edge, String typeOfPolyhedron, int numberOfSides, long length) {
        super(numberOfSides, length);
        this.edge = edge;
        this.typeOfPolyhedron = typeOfPolyhedron;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public String getTypeOfPolyhedron() {
        return typeOfPolyhedron;
    }

    public void setTypeOfPolydron(String typeOfPolyhedron) {
        this.typeOfPolyhedron = typeOfPolyhedron;
    }

    public double area() {

        double area = 2 * Math.sqrt(3) * Math.pow(edge, 2);
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + "\nedge: " + edge + "\nArea of the Octahedron: " + area();
    }

}
