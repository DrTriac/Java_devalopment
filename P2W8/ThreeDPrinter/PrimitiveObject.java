package ThreeDPrinter;

import java.util.Arrays;

public class PrimitiveObject {

    private double[] position = new double[3];
    PrimitiveObject() {
        position[0] = 0.0;
        position[1] = 0.0;
        position[2] = 0.0;
    }

    PrimitiveObject(double x, double y, double z) {
        position[0] = x;
        position[1] = y;
        position[2] = z;
    }

    public double getX() {
        return position[0];
    }
    public double getY() {
        return position[1];
    }
    public double getZ() {
        return position[2];
    }

    public double volume()
    {
        return 0;
    }
//op plaats (-6.0, 0.0, 0.0) en volume 60.00
    @Override
    public String toString() {
        return String.format("op plaats (%f, %f, %f) en volume %f", position[0], position[1], position[2], volume());
    }
}
