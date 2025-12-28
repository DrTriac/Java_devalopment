package verzamelingVanProducten;

public abstract class Product implements Printable {
    private final String ID;
    private String name;
    private String description;

    public Product(String id, String name, String description) {
        this.ID = id;
        this.name = name;
        this.description = description;
    }

    public abstract double calculatePrice();



}
