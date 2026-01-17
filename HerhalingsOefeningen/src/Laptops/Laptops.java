package Laptops;

public class Laptops {
    private Laptop[] laptops;
    private static int amount;

    public Laptops() {
        this.laptops = new Laptop[2000];
        this.amount = 0;
    }

    public void addLaptop(Laptop l)
    {
        if(amount<laptops.length)
        {
            laptops[amount++] = l;

        }
    }

    public static int getAmount() {
        return amount;
    }

    public Laptop getLaptop(int index)
    {
        return laptops[index];
    }

    public void printLaptops()
    {
        System.out.format("er zijn %d laptops:\n ",getAmount());
        for (Laptop l : laptops)
        {
            if(l!=null)
            {
                System.out.println(l);
            }

        }
    }
}
