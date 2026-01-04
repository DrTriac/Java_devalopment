package Boerderijdieren;

public class Cow extends FarmaAnimal {
    private double literMilkPerDay;
    public Cow(String name, double literMilkPerDay) {
        super(name, "boeboe", "grass");
        this.literMilkPerDay = literMilkPerDay;
        //System.out.println(this.toString());
    }



    public double getLiterMilkPerDay() {
        return literMilkPerDay;
    }

    @Override
    public String toString() {
        return String.format("%s maakt het geluid %s en eet %s en geeft %s liter melk", this.getName(),this.getSound(), this.getFood(),literMilkPerDay);

    }
}
