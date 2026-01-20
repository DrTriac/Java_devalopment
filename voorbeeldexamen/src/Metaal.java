public class Metaal extends Atoom{
    double geleiding = 1;

    public Metaal(String naam, String symbool, int atoomnummer) {
        super(naam, symbool, atoomnummer);


    }

    public Metaal(String naam, String symbool, int atoomnummer, double massa) {
        super(naam, symbool, atoomnummer, massa);
    }

    public double getGeleiding() {
        return geleiding;
    }

    public void setGeleiding(double geleiding) {
        if(geleiding > 0)
        {
            this.geleiding = geleiding;
        }else {System.out.println("geleding mag niet kleiner zijn dan 0"); System.exit(1);}
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
