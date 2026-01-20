public class NietMetaal extends Atoom{
    private Boolean isolerend = true;

    public NietMetaal(String naam, String symbool, int atoomnummer) {
        super(naam, symbool, atoomnummer);

    }

    public NietMetaal(String naam, String symbool, int atoomnummer, double massa) {
        super(naam, symbool, atoomnummer, massa);

    }

    public Boolean getIsolerend() {
        return isolerend;
    }

    public void setIsolerend(Boolean isolerend) {
        this.isolerend = isolerend;
    }

    @Override
    public String toString() {
        return super.toString();

    }
}
