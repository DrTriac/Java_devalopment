package verzamelingVanProducten;

public class Cookie extends Product {
    private double price;
    private NutritionalRating nutritionalRating;
    public Cookie(double price, NutritionalRating rating, String id, String name, String description) {
        super(id, name, description);
        this.price = price;
        this.nutritionalRating = rating;
    }

    @Override
    public double calculatePrice()
    {
        return price*1.06;
    }

    @Override
    public void print()
    {
        super.print();
        System.out.printf("nutrirional rating: %s, €");
    }
}
