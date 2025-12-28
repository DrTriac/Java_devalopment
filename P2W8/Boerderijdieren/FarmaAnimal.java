package Boerderijdieren;

public class FarmaAnimal {
    private String name;
    private String sound;
    private String food;

    public FarmaAnimal(String name, String sound, String food) {
        this.name = name;
        this.sound = sound;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    @Override
    public String toString() {
        return null;
    }
}

