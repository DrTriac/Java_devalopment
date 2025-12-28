package Bakkerij;

//abstract class: no object can be made of this class

import java.time.LocalDate;

public abstract class Product {
    private String naam;
    private double prijs;
    private LocalDate vervalDatum;
    private static int totaalProducten=0;

    // gets called when creating an object of this class (?)
    public Product(String naam, double prijs, LocalDate vervalDatum) {
        this.naam = naam;
        this.prijs = prijs;
        this.vervalDatum = vervalDatum;
        totaalProducten++;
    }

    public abstract String productInfo();

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public LocalDate getVervalDatum() {
        return vervalDatum;
    }

    public static int getTotaalProducten() {
        return totaalProducten;
    }
    //espresso (2,5) vervalt op 25-12-05
    @Override
    public String toString() {
        return String.format("%s (€%.2f) vervalt op %s",naam,prijs,vervalDatum);
    }
}
