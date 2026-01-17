package Laptops;

public enum Brand {

    ACER, APPLE, ASUS, DELL, HP, LENOVO, MEDION, TOSHIBA;

    @Override
    public String toString()
    {
        String s = name().toLowerCase();
        String t = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        return String.format(t);
    }
}
