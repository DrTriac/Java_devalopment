package wijnen;

import java.time.LocalDate;

public class Champagne extends Wijn {
    private Smaak smaak;
    public Champagne(String naam, String streek, LocalDate oogstDatum, double basisPrijs, Smaak smaak) {
        super(naam, streek, oogstDatum, basisPrijs);
        this.smaak = smaak;
    }

    //@Override
    //public String berekenPrijs(){
      //  return String.format("pech");
    //}
}
