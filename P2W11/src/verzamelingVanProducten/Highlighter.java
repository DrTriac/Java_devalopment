package verzamelingVanProducten;

public class Highlighter extends Product{
    private double price;
    public Highlighter(String id, String name, String description, double price){
        super(id, name, description);
        this.price = price;
    }

    @Override
    public double calculatePrice(){
        return price *1.21;
    }

    @Override
    public void print(){
        System.out.printf("%s: %s (%s)", name, price, description);
    }


}
