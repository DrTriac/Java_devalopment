package ThreeDPrinter;

public class Cube extends Cuboid{
    private double width;

    public Cube(double x, double y, double z, double width) {
        super(x, y, z, width, width, width);
    }
}
