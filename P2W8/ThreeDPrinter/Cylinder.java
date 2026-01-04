package ThreeDPrinter;

import java.awt.*;

public class Cylinder extends PrimitiveObject {
    private double radius;
    private double height;

    public Cylinder(double radius,double x, double y, double z, double height) {
        super(x, y, z);
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString()
    {
        //Cilinder met straal 5.0 en hoogte 20.0 op plaats (0.0, 0.0, 0.0) en volume 1570.80

        return String.format("Cilinder met straal %s en hoogte %f op plaats (%f,%f,%f) ",radius,height,this.getX(),this.getY(),this.getZ());
    }
}
