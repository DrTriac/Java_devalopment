package ThreeDPrinter;

import java.awt.*;

public class Sphere extends PrimitiveObject {
    private double radius;

    public Sphere(double x, double y, double z, double radius) {
        super(x, y, z);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double volume() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString()
    {
        //Cilinder met straal 5.0 en hoogte 20.0 op plaats (0.0, 0.0, 0.0) en volume 1570.80

        return String.format("Cilinder met straal %s op plaats (%.2f, %.2f, %.2f)", radius, this.getX(), this.getY(), this.getZ());
    }
}
