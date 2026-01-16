package DierenRijk;

public class Animals {
    private Animal[] animals;
    private static int amount;
    public Animals() {
        this.animals = new Animal[100];
        amount = 0;
    }

    private String getName()
    {
        return this.getName();
    }

    public boolean add(Animal animal)
    {
        if(amount++ != animals.length) {
            this.animals[amount++] = animal;
            return true;
        }
        else return false;
    }

    public void show()
    {
        for(Animal animal : animals) {
            System.out.println(animal);
        }
    }

}
