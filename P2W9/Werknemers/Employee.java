package Werknemers;

public abstract class Employee {
    protected final double HOURLY_WAGES = 12.5;
    private String name;
    private long nationalNumber;
    public Employee(String name, long nationalNumber) {
        this.name = name;
        this.nationalNumber = nationalNumber;

    }

    public abstract double getWages();

    public String getName() {
        return name;
    }

    public long getNationalNumber() {
        return nationalNumber;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", nationalNumber=" + nationalNumber + "]";
    }
}
