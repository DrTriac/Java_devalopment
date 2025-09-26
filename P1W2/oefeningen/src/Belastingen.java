import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Belastingen {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("geef het getal in ");
        float getal = scan.nextFloat();
        System.out.println("geef belstingen in ");
        float belastingspercentage = scan.nextFloat();
        float belasingen = 0f;

        belasingen = (getal/100) * belastingspercentage;
        System.out.println("je betaald in totaal: " + belasingen + "€ aan de staat");

    }
}