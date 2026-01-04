package ThreeDPrinter;

public class Cuboid extends PrimitiveObject {
    private double[] size = new double[3];

    Cuboid(double x, double y, double z, double width, double height, double depth) {
    super(x, y, z);
    size[0] = width;
    size[1] = height;
    size[2] = depth;
    }
    double getWidth() {
        return size[0];
    }
    double getHeight() {
        return size[1];
    }
    double getDepth() {
        return size[2];
    }

    @Override
    public String toString()
    {
        //
        // Balk met afmetingen (2.0, 15.0, 2.0) op plaats (-6.0, 0.0, 0.0) en volume 60.00
        return String.format("Balk met afmetingen (%f, %f, %f) op plaats (%f, %f, %f) en volume %d", this.getHeight(), this.getDepth(), this.getWidth(), this.getX(), this.getY(), this.getZ(), volume());
    }
}
