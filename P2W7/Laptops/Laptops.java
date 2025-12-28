package Laptops;

public class Laptops {
    private Laptop[] laptops;
    private int amount;

    public Laptops() {
        laptops = new Laptop[2000];
        amount = 0;
    }

    public int getAmount() {
        return amount;
    }

    public void addLaptop(Laptop laptop) {
        if (amount <= laptops.length) {
            laptops[amount++] = laptop;
        }
    }

    public Laptop[] getLaptops() {
        return laptops;
    }




    public Laptop getLaptop(int number) {
        return laptops[number];
    }


}
