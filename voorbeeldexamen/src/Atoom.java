import java.util.Objects;

public abstract class Atoom {
    private String naam;
    private String symbool;
    private int atoomnummer;
    private double massa;

    public Atoom(String naam, String symbool, int atoomnummer) {
        if(symbool.length() > 2 || symbool.isEmpty())
        {
            System.out.println("symbool is niet geldig. het loet tussen 1 en 2 char lang zijn");
            System.exit(1);
        }
        if(Objects.equals(naam, "") || naam == null)
        {
            System.out.println("naam is niet geldig, naam mag niet leeg of null zijn");
            System.exit(1);
        }
        this.naam = naam;
        this.symbool = symbool;
        this.atoomnummer = atoomnummer;


    }

    public Atoom(String naam, String symbool, int atoomnummer, double massa) {
        this.naam = naam;
        this.symbool = symbool;
        this.atoomnummer = atoomnummer;
        this.massa = massa;
    }

    public double getMassa() {
        return massa;
    }

    public String getSymbool() {
        return symbool;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Atoom atoom)) return false;
        return atoomnummer == atoom.atoomnummer;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(atoomnummer);
    }

    @Override
    public String toString() {
        {
            String s = " ";
            if(this instanceof Metaal) {s = String.format("geleiding: %s",((Metaal) this).geleiding);}
            if(this instanceof NietMetaal)
            {
                if(((NietMetaal) this).getIsolerend())
                {
                    s = String.format("isolerend");
                }else {s = "niet isolerend";}
            }
            return String.format("%s (%s) - atoomnummer: %d - massa: %s - %s\n",this.naam, this.symbool, this.atoomnummer, this.massa,s);

        /* Waterstof (H) - atoomnummer: 1 - massa: 1.0 - niet isolerend
Koolstof (C) - atoomnummer: 6 - massa: 12.0 - isolerend
Zuurstof (O) - atoomnummer: 8 - massa: 15.9 - isolerend
Ijzer (Fe) - atoomnummer: 26 - massa: 55.8 - geleiding:2.30
Koper (Cu) - atoomnummer: 29 - massa: 63.5 - geleiding:17.00
Goud (Au) - atoomnummer: 79 - massa: 197.0 - geleiding:1.00
De metalen:
Koper (Cu) - atoomnummer: 29 - massa: 63.5 - geleiding:17.00
Ijzer (Fe) - atoomnummer: 26 - massa: 55.8 - geleiding:2.30
Goud (Au) - atoomnummer: 79 - massa: 197.0 - geleiding:1.00 */
    }
}
}
