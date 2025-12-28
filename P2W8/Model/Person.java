package Model;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s",this.name);
    }
}
