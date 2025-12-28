package Boerderijdieren;

public class Rabbit extends FarmaAnimal {
    private boolean likesDigging;

    public Rabbit(String name, boolean likesDigging) {
        super(name, "snifsnif", "grass");
        this.likesDigging = likesDigging;
        System.out.println(this.toString());
    }

    public boolean isLikesDigging() {
        return likesDigging;
    }

    @Override
    public String toString() {
        String s = "";
        if(likesDigging){s= "wel";}
        else{s= "niet";}
        return String.format("%s maakt het geluid %s en eet %s en graaft %s graag", this.getName(),this.getSound(), this.getFood(),s);
    }
}
