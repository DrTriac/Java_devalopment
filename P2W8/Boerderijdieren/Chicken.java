package Boerderijdieren;

public class Chicken extends FarmaAnimal {
    private int eggsPerWeek;
    public Chicken(String name, int eggsPerWeek) {
        super(name, "toktok", "mais");
        this.eggsPerWeek = eggsPerWeek;
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return String.format("%s maakt het geluid %s en eet %s en legt %d ei per week",this.getName(),this.getSound(), this.getFood(), this.eggsPerWeek);
    }

}
