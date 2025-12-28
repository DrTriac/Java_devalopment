package Laptops;

public enum CpuType {
    I3, I5, I7;
    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
