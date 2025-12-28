package Model;

import java.util.ArrayList;
//
public class Model extends Person {
    private BodyMeasures measures;
    private Adress adress;

    public Model(String name, double bust, double waist, double hips) {
        super(name);
        this.measures = new BodyMeasures(bust, waist, hips);
        this.adress = null; // no address by default
    }
    public Model(String name) {
        super(name);
        this.measures = new BodyMeasures();
        this.adress = null;
    }

    public double getBust() {return measures.getBust();}
    public double getWaist() {return measures.getWaist();}
    public double getHips() {return measures.getHips();}

    public Adress getAdress() {return adress;}
    public void setAdress(Adress adress) {this.adress = adress;}

    @Override
    public String toString() {
        String adressString;

        if (this.adress != null) {
            adressString = this.getAdress().toString();
        }
        else {adressString = "onbekend";}

        return String.format("Naam: %s\nAdress: %s\nMaten: %s,%s,%s", super.getName(),adressString, this.getBust(), this.getWaist(), this.getHips());
    }
}

