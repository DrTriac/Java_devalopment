package Cache;

public class TireSize {
    private int diameter;
    private int width;
    private int aspect;

    public TireSize(int diameter, int width, int aspect) {
        this.diameter = diameter;
        this.width = width;
        this.aspect = aspect;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getWidth() {
        return width;
    }

    public int getAspect() {
        return aspect;
    }

    @Override
    public String toString() {
        return
                "diameter=" + diameter +
                ", width=" + width +
                ", aspect=" + aspect;
    }
}
