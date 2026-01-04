package Werknemers;

public class HourlyWorker extends Employee {
    protected final int MAX_HOURS_PER_WEEK = 38;
    private int hours;
    public HourlyWorker(String name, long nationalNumber, int hours) {
        super(name, nationalNumber);
        this.hours = hours;


    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getWages()
    {
        if(hours > MAX_HOURS_PER_WEEK)
        {
            return hours * HOURLY_WAGES*1.5;
        }
        return hours*this.HOURLY_WAGES;


    }

    @Override
    public String toString() {

        return String.format("Naam: %s\nNummer: %d\nLoon: %s\n",this.getName(), this.getNationalNumber(),this.getWages());
    }

}
