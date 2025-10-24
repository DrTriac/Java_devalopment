package Kotbaas;

public class Student {
    String name;
    String street;
    String city;
    int postalCode;

    public Student(String name, String street, String city, int postalCode) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", name, street, postalCode, city);
    }
}
