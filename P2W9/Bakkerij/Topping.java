package Bakkerij;

public enum Topping {
    CHOCOLADE, KARAMEL, KANEEL;

    //
    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
