package Bakkerij;

import java.time.LocalDate;

public final class Koffie extends Product implements Consumeerbaar{
    private boolean vegan;

    public Koffie(String naam, double prijs, LocalDate vervalDatum, boolean vegan) {
        super(naam, prijs, vervalDatum);
        this.vegan = vegan;
    }

    @Override
    public String productInfo() {
        return "Koffie";
    }

    @Override
    public String serveerBeschrijving() {
        return "Een koffie moet heet geserveerd worden";
    }
}
