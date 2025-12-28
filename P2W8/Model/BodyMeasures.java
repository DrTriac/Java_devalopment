package Model;

public class BodyMeasures {
    //deze heeft attributen borstomtrek (bust), heupomtrek (hips) en taille (waist), allen van het type double

    private double bust;
    private double hips;
    private double waist;

    public BodyMeasures(double bust, double hips, double waist) {
        this.bust = bust;
        this.hips = hips;
        this.waist = waist;
    }

    public BodyMeasures() {
        bust = 90;
        hips = 60;
        waist = 90;
    }

    public double getBust() {
        return bust;
    }

    public void setBust(double bust) {
        this.bust = bust;
    }

    public double getHips() {
        return hips;
    }

    public void setHips(double hips) {
        this.hips = hips;
    }

    public double getWaist() {
        return waist;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s",bust,hips,waist);
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }
}
