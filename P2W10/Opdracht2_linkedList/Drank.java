package Opdracht2_linkedList;

public class Drank implements Comparable<Drank> {
    private String naam;
    private Double prijs;
    private Boolean isAlcohlisch;

    public Drank(String naam, Double prijs) {
        this.naam = naam;
        this.prijs = prijs;
        this.isAlcohlisch = false;
    }

    public Drank(String naam, Double prijs, Boolean alcohlisch) {
        this.naam = naam;
        this.prijs = prijs;
        this.isAlcohlisch = alcohlisch;
    }

    @Override
    public String toString() {
        return String.format("%s €%s", this.naam, this.prijs);
    }

    public String getNaam() {
        return naam;
    }

    public Double getPrijs() {
        return prijs;
    }

    public Boolean getAlcohlisch() {
        return isAlcohlisch;
    }
    @Override
    public int compareTo(Drank o) {
        return this.prijs.compareTo(o.prijs);
    }

}
