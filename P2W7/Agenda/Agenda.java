package Agenda;

import java.util.ArrayList;

public class Agenda {
    private String naam;
    private Afspraak[] afspraken;
    private final int MAX_AANTAL = 10;
    private int aantal;
    public Agenda(String owner) {
        this.naam = owner;
        this.afspraken = new Afspraak[MAX_AANTAL-1];

    }

    public boolean voegAfspraakToe(Afspraak afspraak)
    {
        if (afspraak.getAantalAfspraken() < MAX_AANTAL)
        {
            int previous = afspraak.getAantalAfspraken();
            afspraken[previous++] = afspraak;
            aantal++;
            return true;
        }
        else
            return false;
    }

    public Afspraak getAfspraak(int index)
    {
        return afspraken[index];
    }

    public int getAantal() {
        return aantal;
    }

    public String getNaam() {
        return naam;
    }
}

