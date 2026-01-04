package Boerderijdieren;

public class Farm {
    private final int MAW_CAPACITY = 5;
    private FarmaAnimal[] animals;
    private int amountOfAnimals;

    public Farm() {
        this.animals = new FarmaAnimal[MAW_CAPACITY];
        amountOfAnimals = 0;
    }
    public void addAnimal(FarmaAnimal animal) {
        if (amountOfAnimals != MAW_CAPACITY) {
            animals[amountOfAnimals++] = animal;
        }
    }

    public void showAnimals()
    {
        for (FarmaAnimal a : animals) {
            System.out.printf(a.describe() + "\n");
        }
    }

    public void showSounds()
    {
        for (FarmaAnimal a : animals) {
            System.out.printf(a.soundLine() + "\n");
        }
    }

    public void showFoods()
    {
        for (FarmaAnimal a : animals) {
            System.out.printf(a.foodLine() + "\n");
        }
    }

    public FarmaAnimal findAnimalByName(String name) {
        for (FarmaAnimal a : animals) {
            if (a.getName().equals(name)) {
                return a;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "poop";
    }

}
