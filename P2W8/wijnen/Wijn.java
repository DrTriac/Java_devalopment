package wijnen;

import java.time.LocalDate;

public class Wijn {
    private String naam;
    private String streek;
    private LocalDate oogstDatum;
    private double basisPrijs;

    public Wijn( String naam, String streek, LocalDate oogstDatum, double basisPrijs) {
        this.naam = naam;
        this.streek = streek;
        this.oogstDatum = oogstDatum;
        this.basisPrijs = basisPrijs;

    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public String getStreek() {
        return streek;
    }

    public LocalDate getOogstDatum() {
        return oogstDatum;
    }

    protected double getBasisPrijs() {
        return basisPrijs;
    }

    public double berekenPrijs()
    {
        return basisPrijs;
    }
    public final String getKenmerken()
    {
        return String.format("Van %s, afkomstig uit %s", oogstDatum, streek);
    }

    @Override
    public String toString()
    {
        return String.format("%-44s € %6.2f \n \t (%s)", naam, berekenPrijs(), getKenmerken());
    }
}

