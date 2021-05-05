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
public class Cuboid extends Shapes {

    private long width;
    private float height;

    public Cuboid(long width, float height, int numberOfSides, double length) {
        super(numberOfSides, length);
        this.width = width;
        this.height = height;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double area() {

        double area = 2 * height * (super.getLength() + width);

        return area;
    }

    @Override
    public String toString() {
        return super.toString() + "\nwidth: " + width + "\nheight: " + height
                + "\nArea: " + area();
    }

}
