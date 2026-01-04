package DierenRijk;

public class Ostrich implements LaysEggs, Animal {
    private String name;
    private int numberOfEggsPerYear;

    public Ostrich(String name, int numberOfEggsPerYear) {
        this.name = name;
        this.numberOfEggsPerYear = numberOfEggsPerYear;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getAmountOfEggsPerYear() {
        return 0;
    }

    @Override
    public String toString()
    {
        //Naam: struis
        //Eieren: 6
        return String.format("Naam: %s\nEieren: %d", this.name, this.numberOfEggsPerYear);
    }
}
