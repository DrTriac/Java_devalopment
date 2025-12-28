package Bakkerij;

import java.io.Serializable;
import java.time.LocalDate;

public class CinnamonRoll extends Product implements Consumeerbaar {
    private Topping topping;
    public CinnamonRoll(String naam, double prijs, Topping topping, LocalDate vervalDatum) {
      super(naam,prijs,vervalDatum);
      this.topping = topping;
    }

    @Override
    public String productInfo() {
        return "Cinnamon Roll";
    }

    @Override
    public boolean isVervallen() {
        return Consumeerbaar.super.isVervallen();
    }

    @Override
    public String serveerBeschrijving() {
        return "cinnamon roll moet koud geserveerd worden";
    }
}
