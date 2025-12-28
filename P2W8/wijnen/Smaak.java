package wijnen;

public enum Smaak {
    BRUT, EXTRA_BRUT, BRUT_SANS_MILLESIME,SEC,DEMI_SEC,DOUX;

    @Override
    public String toString() {
        return switch(this)
        {
            case BRUT -> "Brut";
            case EXTRA_BRUT -> "Extra Brut";
            case BRUT_SANS_MILLESIME ->  "Brut, Sans Millésime";
            case SEC -> "Sec";
            case DEMI_SEC -> "Demi-Sec";
            case DOUX -> "Doux";
        };
    }
}
