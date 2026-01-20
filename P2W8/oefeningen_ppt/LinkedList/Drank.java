package LinkedList;

public class Drank {
    private String naam;
    private double prijs;
    private Boolean isAlcoholisch;

    public Drank(String naam, double prijs, Boolean isAlcoholisch) {
        this.naam = naam;
        this.prijs = prijs;
        this.isAlcoholisch = isAlcoholisch;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public Boolean getAlcoholisch() {
        return isAlcoholisch;
    }
}
