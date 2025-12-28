package verzamelingVanProducten;

public class Apple extends Product{
    private double weightKg;
    private double pricePerKg;
    private String variety;

    public Apple(String id, String name, String description, double weightKg, double pricePerKg, String variety) {
        super(id, name, description);
        this.weightKg = weightKg;
        this.pricePerKg = pricePerKg;
        this.variety = variety;
    }
    @Override
    public double calculatePrice(){
        return pricePerKg* weightKg * 1.06;
    }

    @Override
    public void print(){
        super.print();
        System.out.printf("%s: %s (%s)");
    }
}
