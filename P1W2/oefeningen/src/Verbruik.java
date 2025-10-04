import java.util.Scanner;
public class Verbruik {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int preStand =0;
        int postStand=0;
        int aantalKm=0;
        float getankt=0.0f;

        System.out.println("geef je vorige kilometerstand in: ");
        preStand=scan.nextInt();
        System.out.println("geef je huidige kilometerstand in: ");
        postStand=scan.nextInt();
        aantalKm=postStand-preStand;
        System.out.println("geef je aantal getankte liters in ");
        getankt=scan.nextFloat();


        float preStandF = (float) preStand;
        float postStandF = (float) postStand;

        System.out.println("verbruik voor "+aantalKm+"km: "+ getankt/10+"L/100km");

    }

}
