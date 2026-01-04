package DierenRijk;

public class Eagle implements LaysEggs ,CanFly, Animal {

    private String name;
    private int amountOfEggsPerYear;
    private double maxFlyingSpeed;
    private double maxDivingSpeed;

    public Eagle(String name, int amountOfEggsPerYear, int maxFlyingSpeed, int maxDivingSpeed) {
        this.name = name;
        this.amountOfEggsPerYear = amountOfEggsPerYear;
        this.maxFlyingSpeed = maxFlyingSpeed;
        this.maxDivingSpeed = maxDivingSpeed;
    }


    public double getMaxFlyingSpeed() {
        return 0;
    }

    public int getAmountOfEggsPerYear() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public double getDivingSpeed() {
        return this.maxDivingSpeed;
    }

    @Override
    public String toString() {
        //Naam: eagle
        //Eieren: 2
        //Snelheid: 50 km/h
        //Duiksnelheid: 160 km/h
        return String.format("Naam: %s\n Eieren: %d\n Snelheid: %s km/h\n Duiksnelheid: %s km/h",this.name,this.amountOfEggsPerYear, this.maxFlyingSpeed, this.maxDivingSpeed);
    }

}


