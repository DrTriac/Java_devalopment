package Werknemers;

public class SalariedEmployee extends Employee {
    private final int WAGE_FACTOR =192;
    private double wageBarema;

    public SalariedEmployee(String name, long nationalNumber, double wageBarema) {
        super(name, nationalNumber);
        this.wageBarema = wageBarema;

    }
    public double getWages() {
        return this.HOURLY_WAGES * WAGE_FACTOR * this.wageBarema;
    }

    @Override public String toString()
    {
        return String.format("Naam: %s\nNummer: %d\nLoon: %s\n",this.getName(), this.getNationalNumber(),this.getWages());
    }
}
