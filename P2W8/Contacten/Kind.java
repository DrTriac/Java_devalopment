package Contacten;

public enum Kind {
    FIXED, MOBILE;

    @Override
    public String toString() {
        if (name().equals("FIXED")) { return "(V)";}
        else{ return "(M)";}
    }
}
