package Aardrijkskunde;

public enum Continent {

    NORTH_AMERICA(24256000L, 470),
    SOUTH_AMERICA(17819000L, 331),
    EUROPE(10530750L, 728),
    ASIA(44579000L, 3604),
    AFRICA(30665000L, 654.5),
    AUSTRALIA(8535117L, 29.5),
    ANTARCTICA(13209000L, 0);


    private final long area;
    private final double population;

    private Continent(long opp, double population) {
        this.population = population;
        this.area = opp;
    }

    private int populationDensity()
    {
        double popdens = this.population*1000000/this.area;
        return (int) (popdens);
    }

    @Override
    public String toString()
    {
        return String.format(this.name() + " " + this.populationDensity(), this.area);
    }
}
