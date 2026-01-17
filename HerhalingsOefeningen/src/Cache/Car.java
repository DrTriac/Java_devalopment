package Cache;

public class Car {
    private String model;
    private String brand;
    private TireSize tireSize;

    public Car(String model, String brand, TireSize tireSize) {
        this.model = model;
        this.brand = brand;
        this.tireSize = tireSize;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public TireSize getTireSize() {
        return tireSize;
    }

    @Override
    public String toString()
    {
        return String.format("model: %s Brand: %s tiresize: %s",this.model, this.brand, this.tireSize);

    }
}
