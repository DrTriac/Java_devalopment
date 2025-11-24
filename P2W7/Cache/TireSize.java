package Cache;

public class TireSize {
    int diameter;
    int aspect;
    int width;

    TireSize(int diameter, int aspect, int width) {
        this.diameter = diameter;
        this.aspect = aspect;
        this.width = width;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getAspect() {
        return aspect;
    }

    public void setAspect(int aspect) {
        this.aspect = aspect;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
