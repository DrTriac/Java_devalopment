package Cache;

public class Car {
    String Brand;
    String Model;
    TireSize tireSize;

    Car(String Brand, String Model, TireSize tireSize) {
        this.Brand = Brand;
        this.Model = Model;
        this.tireSize = tireSize;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public TireSize getTireSize() {
        return tireSize;
    }

    public void setTireSize(TireSize tireSize) {
        this.tireSize = tireSize;
    }

    @Override
    public String toString() {
        return this.Brand + " " + this.Model + " " + this.tireSize;
    }
}
