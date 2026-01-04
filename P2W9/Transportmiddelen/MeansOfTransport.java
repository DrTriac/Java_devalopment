package Transportmiddelen;

public abstract class MeansOfTransport {
    double speed;

    public MeansOfTransport(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String travelDistance(double distance) {
        String S = "";
        double result = (distance * 10/speed);
        int resultI = (int) result;

        if (this instanceof OnFoot) {
            S = "Stap";
        } else if (this instanceof Bus) {
            S = "Vroem";
        } else if (this instanceof Train) {
            S = "tuut";
        } else if (this instanceof Step) {
            S = "zzz";
        } else if (this instanceof Fiets) {
            S = "iepe";
        }
        for (int i = 0; i < resultI; i++) {
            S = S + "-" + S;
        }
        System.out.println(resultI);
        return S;
    }


}
